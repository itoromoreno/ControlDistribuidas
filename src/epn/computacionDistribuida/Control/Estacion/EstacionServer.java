package epn.computacionDistribuida.Control.Estacion;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;

import epn.computacionDistribuida.Control.Estacion.Estacion;

import java.rmi.NotBoundException;

public class EstacionServer {
	public static void main(String[] args) throws RemoteException,NotBoundException
    {
        try
        {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1090);
            r.rebind("Estacion", new Estacion());
            System.out.println("El servidor de la estación está corriendo");
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
    }


}
