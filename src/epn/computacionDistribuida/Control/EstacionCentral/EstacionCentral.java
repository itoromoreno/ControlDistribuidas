package epn.computacionDistribuida.Control.EstacionCentral;

import epn.computacionDistribuida.Control.commons.estado.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EstacionCentral extends UnicastRemoteObject implements IEstacionCentral {

	protected EstacionCentral() throws RemoteException {
		super();
	}


	@Override
	public void recibirEstado(Estado e) {
		// TODO Auto-generated method stub
		
	}

}
