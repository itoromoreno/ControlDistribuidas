package epn.computacionDistribuida.Control.EstacionCentral;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.NotBoundException;

public class EstacionCentralServer {
	public static void main(String[] args) throws RemoteException,NotBoundException
    {
        try
        {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1090);
            r.rebind("EstacionCentral", new EstacionCentral());
            System.out.println("El servidor de la estación central está corriendo");
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
    }
}
