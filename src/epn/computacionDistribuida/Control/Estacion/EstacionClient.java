package epn.computacionDistribuida.Control.Estacion;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import epn.computacionDistribuida.Control.Controlador.*;
import epn.computacionDistribuida.Control.EstacionCentral.IEstacionCentral;
import epn.computacionDistribuida.Control.commons.estado.Estado;
import epn.computacionDistribuida.Control.commons.estado.Estado.Estados;


public class EstacionClient extends Thread{
	
	Estado estado;
	IControlador controlador;
	IEstacionCentral estacioncentral;
	
	boolean suspender=false;
	boolean parar=false;
	boolean continuar=true;
	
	
	public void detenerEstacion() throws RemoteException {
		this.controlador.parar();
		continuar=false;
	}
	public void iniciarEstacion() throws RemoteException {
		this.controlador.iniciar();
		while (continuar)
	      {
			System.out.println("Iniciando estación");
	      }
	}
	
}	
	
	
	


