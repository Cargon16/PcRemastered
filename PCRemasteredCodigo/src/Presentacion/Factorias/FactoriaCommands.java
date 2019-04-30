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
	private static FactoriaCommands instance= null;

	/** 
	* @return the instance
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_21bCoFSUEemuHuD_HqBchg?GETTER"
	*/
	public static FactoriaCommands getInstance() {
		// begin-user-code
		if ( instance== null){
			instance= new FactoriaCommandsImp();
		}
		return instance;
	}	
	public abstract Command generacionCommand(Evento evento);
		
}