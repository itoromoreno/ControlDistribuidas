package epn.computacionDistribuida.Control.EstacionCentral;
import java.rmi.Remote;
import java.rmi.RemoteException;

import epn.computacionDistribuida.Control.commons.estado.*;

public interface IEstacionCentral extends Remote{

	public void recibirEstado(Estado e) throws RemoteException;
	
}