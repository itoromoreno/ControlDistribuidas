package epn.computacionDistribuida.Control.Estacion;
import epn.computacionDistribuida.Control.Controlador.IControlador;
import epn.computacionDistribuida.Control.EstacionCentral.EstacionCentralClient;
import epn.computacionDistribuida.Control.commons.estado.*;
import epn.computacionDistribuida.Control.commons.estado.Estado.Estados;
import java.util.Random;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Estacion extends UnicastRemoteObject implements IEstacion {
	
	EstacionClient cliente;
	Estado estado=new Estado();
	IControlador controlador;
	
	
	public Estacion() throws RemoteException, MalformedURLException, NotBoundException {
		super();

		cliente  = new EstacionClient();
		cliente.start();
	}

	@Override
	public void iniciar() throws RemoteException{
		// TODO Auto-generated method stub
		
		cliente.iniciarEstacion();
		
		while(true) {	
			generarEstado();
            	
            	try {
					Thread.sleep(6000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
				
		}
		

	@Override
	public void parar() throws RemoteException {
		// TODO Auto-generated method stub
		
		cliente.detenerEstacion();	
	}

	@Override
	public void activarSA() throws RemoteException {
			
		try
        {
            controlador = (IControlador) Naming.lookup("//localhost:1091/Controlador");
            
  
            while(true) {
            	
            	
            	System.out.println("Activando alarma contra incendios");
            	parar();
            	
            	//Thread.sleep(10000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

	}

	@Override
	public void generarEstado() throws RemoteException {
		// TODO Auto-generated method stub
		int numero = (int) (Math.random() * 2);
		System.out.println(estado.estado.values()[numero]);
		
	}

	@Override
	public Estado reportarEstado() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(estado.estado.toString());
		
		return null;
	}

	
}
