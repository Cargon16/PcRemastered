/**
 * 
 */
package Presentacion.Productos;

import Presentacion.Ventana;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_FJOqIFMOEemdZLpuw9I4eQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_FJOqIFMOEemdZLpuw9I4eQ"
 */
public abstract class VentanaProducto implements Ventana {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_FJOqI1MOEemdZLpuw9I4eQ"
	*/
	private static VentanaProducto instance;

	/** 
	* @return the instance
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_FJOqI1MOEemdZLpuw9I4eQ?GETTER"
	*/
	public static VentanaProducto getInstance() {
		// begin-user-code
		return instance;
		// end-user-code
	}

	/** 
	* @param instance the instance to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_FJOqI1MOEemdZLpuw9I4eQ?SETTER"
	*/
	public static void setInstance(VentanaProducto instance) {
		// begin-user-code
		VentanaProducto.instance = instance;
		// end-user-code
	}
}