/**
 * 
 */
package Presentacion.Personal;

import javax.swing.JFrame;

import Presentacion.Ventana;


public abstract class VentanaPersonal extends JFrame implements Ventana {
private static VentanaPersonal instance = null;

	
	public static VentanaPersonal getInstance() {
		if ( instance==null){
			instance = new VentanaPersonalImp();
		}
		return instance;
	}


	public static void setInstance(Object object) {
		// TODO Auto-generated method stub
		instance=null;
	}
}