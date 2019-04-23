/**
 * 
 */
package Presentacion.Envios;

import Presentacion.Personal.Ventana;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_aIn_kFLqEemG-P2dJpE1PA"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_aIn_kFLqEemG-P2dJpE1PA"
*/
public abstract class VentanaEnvio implements Ventana {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_kLFjAFLqEemG-P2dJpE1PA"
	*/
	private static VentanaEnvio instance;

	/** 
	* @return the instance
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_kLFjAFLqEemG-P2dJpE1PA?GETTER"
	*/
	public static VentanaEnvio getInstance() {
		// begin-user-code
		return instance;
		// end-user-code
	}

	/** 
	* @param instance the instance to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_kLFjAFLqEemG-P2dJpE1PA?SETTER"
	*/
	public static void setInstance(VentanaEnvio instance) {
		// begin-user-code
		VentanaEnvio.instance = instance;
		// end-user-code
	}
}