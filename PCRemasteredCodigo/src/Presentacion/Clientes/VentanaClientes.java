/**
 * 
 */
package Presentacion.Clientes;

import javax.swing.JFrame;
import Presentacion.Personal.Ventana;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_DBsScFOpEemH9v7SOzgnzQ"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_DBsScFOpEemH9v7SOzgnzQ"
*/
public abstract class VentanaClientes extends JFrame implements Ventana {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_HhjwAFOpEemH9v7SOzgnzQ"
	*/
	private static VentanaClientes instance;

	/** 
	* @return the instance
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_HhjwAFOpEemH9v7SOzgnzQ?GETTER"
	*/
	public static VentanaClientes getInstance() {
		// begin-user-code
		return instance;
		// end-user-code
	}

	/** 
	* @param instance the instance to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_HhjwAFOpEemH9v7SOzgnzQ?SETTER"
	*/
	public static void setInstance(VentanaClientes instance) {
		// begin-user-code
		VentanaClientes.instance = instance;
		// end-user-code
	}
}