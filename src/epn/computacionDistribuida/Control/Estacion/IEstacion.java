package epn.computacionDistribuida.Control.Estacion;
import java.rmi.Remote;
import java.rmi.RemoteException;

import epn.computacionDistribuida.Control.commons.estado.*;

public interface IEstacion extends Remote{

	public void iniciar() throws RemoteException;
	public void parar() throws RemoteException;
	public void activarSA() throws RemoteException;
	public void generarEstado() throws RemoteException;
	public Estado reportarEstado() throws RemoteException;
	public void cambiarEstado() throws RemoteException;
	
}
