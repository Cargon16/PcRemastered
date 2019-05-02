/**
 * 
 */
package Presentacion.Productos;

import javax.swing.JFrame;

import Presentacion.Ventana;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_FJOqIFMOEemdZLpuw9I4eQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_FJOqIFMOEemdZLpuw9I4eQ"
 */
public abstract class VentanaProducto extends JFrame implements Ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static VentanaProducto instance = null;

	
	public static VentanaProducto getInstance() {
		// begin-user-code
		if(instance==null){
			instance = new VentanaProductosImp();
			
		}
		return instance;
		// end-user-code
	}

	public static void setInstance() {
		
		instance = null;
		
	}
}