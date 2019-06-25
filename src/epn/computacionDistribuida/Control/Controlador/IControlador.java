package epn.computacionDistribuida.Control.Controlador;

public interface IControlador {

	public void iniciar();
	public void parar();
	public void recibirNotificaciones(Estado e);
}
