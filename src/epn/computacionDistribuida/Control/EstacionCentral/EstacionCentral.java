package epn.computacionDistribuida.Control.EstacionCentral;

import epn.computacionDistribuida.Control.commons.estado.*;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EstacionCentral extends UnicastRemoteObject implements IEstacionCentral {

	EstacionCentralClient cliente;
	
	public EstacionCentral() throws RemoteException, MalformedURLException, NotBoundException {
		super();
		cliente  = new EstacionCentralClient();
		cliente.start();
	}
	
	@Override
	public void recibirEstado(Estado e) throws RemoteException {
		cliente.informarEstado();
	}

}
