package epn.computacionDistribuida.Control.Controlador;
import java.rmi.Remote;
import java.rmi.RemoteException;

import epn.computacionDistribuida.Control.commons.estado.*;

public interface IControlador extends Remote{

	public void iniciar() throws RemoteException;
	public void parar() throws RemoteException;
	public void recibirNotificaciones(Estado e) throws RemoteException;
}
