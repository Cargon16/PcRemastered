package Presentacion;

import javax.swing.JFrame;

import Presentacion.Command.Contexto;

public abstract class  VentanaPrincipal extends JFrame implements Ventana {
	public VentanaPrincipal() {
	}
	
	private static final long serialVersionUID = 1L;
	public static VentanaPrincipal instance = null;
	public static VentanaPrincipal getInstance() {
		if(instance==null)
			instance = new VentanaPrincipalImp();
		return instance;
	}
	 
	@Override
	public abstract void Actualizar(Contexto contexto) ;
}
