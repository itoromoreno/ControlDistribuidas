package epn.computacionDistribuida.Control.commons.estado;

import java.io.Serializable;

public class Estado implements Serializable{

	public enum Estados{
		Correcto,
		Incorrecto,
		Fuego
	}
	
	public Estados estado;
}
