package epn.computacionDistribuida.Control.EstacionCentral;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import epn.computacionDistribuida.Control.Controlador.IControlador;
import epn.computacionDistribuida.Control.Estacion.IEstacion;

public class EstacionCentralClient {
	
	public static void main(String[] args) throws NotBoundException,RemoteException, MalformedURLException {
        try
        {
            IControlador controlador = (IControlador) Naming.lookup("//localhost:1090/Calculator");
            IEstacion estacion = (IEstacion) Naming.lookup("//localhost:1090/Calculator");
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
	
}
