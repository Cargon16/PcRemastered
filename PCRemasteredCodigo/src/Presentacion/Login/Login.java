package Presentacion.Login;

import javax.swing.JFrame;

import Presentacion.Ventana;
import Presentacion.Command.Contexto;



public abstract class Login extends JFrame implements Ventana {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Login Instance = null;
	public static Login getInstance(){
		if( Instance== null)
			Instance= new LoginImp();
		return Instance;
	}
	
	
	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}
