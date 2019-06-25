package epn.computacionDistribuida.Control.Estacion;
import epn.computacionDistribuida.Control.commons.estado.*;

public interface IEstacion {

	public void iniciar();
	public void parar();
	public void activarSA();
	public void generarEstado();
	public Estado reportarEstado();
	public void cambiarEstado();
	
}
