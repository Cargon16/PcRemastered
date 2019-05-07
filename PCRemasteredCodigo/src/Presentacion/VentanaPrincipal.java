package Presentacion;

import Presentacion.Command.Contexto;

public abstract class  VentanaPrincipal implements Ventana {
	public static VentanaPrincipal instance = null;
	public static VentanaPrincipal getInstance() {
		if(instance==null)
			instance = new VentanaPrincipalImp();
		return instance;
	}
	 
	@Override
	public abstract void Actualizar(Contexto contexto) ;
}
