package epn.computacionDistribuida.Control.EstacionCentral;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import epn.computacionDistribuida.Control.Controlador.*;
import epn.computacionDistribuida.Control.Estacion.IEstacion;
import epn.computacionDistribuida.Control.commons.estado.Estado;
import epn.computacionDistribuida.Control.commons.estado.Estado.Estados;

public class EstacionCentralClient extends Thread{
	
	Estado estado;
	IControlador controlador;
	IEstacion estacion;
	
	@Override
	public void run() {
		try {
			funcionar();
		} catch (RemoteException | MalformedURLException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void funcionar() throws NotBoundException,RemoteException, MalformedURLException {
		try
        {
            controlador = (IControlador) Naming.lookup("//localhost:1091/Controlador");
            estacion = (IEstacion) Naming.lookup("//localhost:1092/Estacion");
            
            //Iniciar Funcionamiento
            controlador.iniciar();
            
            //Preguntar por el estado a cada estación cada 10 segundos;
            while(true) {
            	estado = estacion.reportarEstado();
            	System.out.println(estado.estado.toString());
            	if(estado.estado == Estados.Fuego || estado.estado == Estados.Incorrecto) {
            		informarEstado();
            	}
            	Thread.sleep(10000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
	
	public void informarEstado() throws RemoteException {
		this.controlador.recibirNotificaciones(estado);
	}
	
}
