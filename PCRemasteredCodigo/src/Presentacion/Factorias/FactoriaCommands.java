/**
 * 
 */
package Presentacion.Factorias;

import Presentacion.Command.Evento;
import Presentacion.Command.Command;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_uWMMgFSUEemuHuD_HqBchg"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_uWMMgFSUEemuHuD_HqBchg"
*/
public abstract class FactoriaCommands {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_21bCoFSUEemuHuD_HqBchg"
	*/
	private static FactoriaCommands instance;

	/** 
	* @return the instance
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_21bCoFSUEemuHuD_HqBchg?GETTER"
	*/
	public static FactoriaCommands getInstance() {
		// begin-user-code
		return instance;
		// end-user-code
	}

	/** 
	* @param instance the instance to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_21bCoFSUEemuHuD_HqBchg?SETTER"
	*/
	public static void setInstance(FactoriaCommands instance) {
		// begin-user-code
		FactoriaCommands.instance = instance;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param evento
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_7x91IFSUEemuHuD_HqBchg"
	*/
	public Command generacionCommand(Evento evento) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}