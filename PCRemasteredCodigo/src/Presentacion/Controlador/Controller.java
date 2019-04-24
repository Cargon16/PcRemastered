/**
 * 
 */
package Presentacion.Controlador;

import Presentacion.Command.Contexto;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_vlTV4FSSEemqP5TUGFgFsg"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_vlTV4FSSEemqP5TUGFgFsg"
*/
public abstract class Controller {

	private static Controller instance;

	
	public static Controller getInstance() {
		if ( instance == null){
			instance = new ControllerImp();
		}
		return instance;
	}
	public  abstract void  ejecutar(Contexto contexto);
}