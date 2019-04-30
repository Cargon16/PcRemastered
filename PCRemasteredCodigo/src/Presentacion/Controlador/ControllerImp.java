/**
 * 
 */
package Presentacion.Controlador;

import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Factorias.FactoriaCommands;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_xAqgoFSSEemqP5TUGFgFsg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_xAqgoFSSEemqP5TUGFgFsg"
 */
public class ControllerImp extends Controller {

	@Override
	public void ejecutar(Contexto contexto) {
		
		Command comando= FactoriaCommands.getInstance().generacionCommand(contexto.getEvento());
		Contexto vista= comando.ejecutar(contexto);	// capa de negocio	
		comando.ejecutar(vista); // creacion o actualizacion de la capa de presentancion.
	}
}