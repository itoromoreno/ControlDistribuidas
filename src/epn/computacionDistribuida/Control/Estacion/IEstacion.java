package epn.computacionDistribuida.Control.Estacion;

public interface IEstacion {

	public void iniciar();
	public void parar();
	public void notificar();
	public void generarEstado();
	public void cambiarEstado();
	
}
