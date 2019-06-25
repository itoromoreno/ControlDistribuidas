package epn.computacionDistribuida.Control.Controlador;
import epn.computacionDistribuida.Control.commons.estado.*;

public interface IControlador {

	public void iniciar();
	public void parar();
	public void recibirNotificaciones(Estado e);
}
