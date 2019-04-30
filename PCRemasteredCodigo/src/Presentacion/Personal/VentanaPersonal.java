/**
 * 
 */
package Presentacion.Personal;

import javax.swing.JFrame;

import Presentacion.Ventana;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_jpQyME8iEemfNOmfBQSQBw"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_jpQyME8iEemfNOmfBQSQBw"
*/
public abstract class VentanaPersonal extends JFrame implements Ventana {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_pHt-8E8iEemfNOmfBQSQBw"
	*/
	private static VentanaPersonal instance;

	/** 
	* @return the instance
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_pHt-8E8iEemfNOmfBQSQBw?GETTER"
	*/
	public static VentanaPersonal getInstance() {
		// begin-user-code
		return instance;
		// end-user-code
	}

	/** 
	* @param instance the instance to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_pHt-8E8iEemfNOmfBQSQBw?SETTER"
	*/
	public static void setInstance(VentanaPersonal instance) {
		// begin-user-code
		VentanaPersonal.instance = instance;
		// end-user-code
	}
}