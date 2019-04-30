/**
 * 
 */
package Presentacion.Proveedores;

import Presentacion.Ventana;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_7sYA4FLbEemZgJHrDkdxCQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_7sYA4FLbEemZgJHrDkdxCQ"
 */
public abstract class VentanaProveedores implements Ventana {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_VOV_QFLcEemZgJHrDkdxCQ"
	*/
	private static VentanaProveedores instance;

	/** 
	* @return the instance
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_VOV_QFLcEemZgJHrDkdxCQ?GETTER"
	*/
	public static VentanaProveedores getInstance() {
		// begin-user-code
		return instance;
		// end-user-code
	}

	/** 
	* @param instance the instance to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_VOV_QFLcEemZgJHrDkdxCQ?SETTER"
	*/
	public static void setInstance(VentanaProveedores instance) {
		// begin-user-code
		VentanaProveedores.instance = instance;
		// end-user-code
	}
}