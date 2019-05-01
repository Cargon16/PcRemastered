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
		
		Command comando = FactoriaCommands.getInstance().generacionCommand(contexto.getEvento()); 
		Contexto vista = comando.ejecutar(contexto); 
		//EJEMPLO DE EJECUCION
		//ejecuta el comando añadirCliente---> esto devuelve un contexto (evento ClienteVista , Object( evento añadirCliente, objeto) )
		//es decir devolvemos un contexto dentro de otro contexto en todos excepto en los de generacion de vista inicial.
		// en esos casos el Object sera null y no ejecutara el siguiente comando.
		if (vista.getDatos()!=null)
				comando = FactoriaCommands.getInstance().generacionCommand(vista.getEvento()); 
				comando.ejecutar(vista);//actualiza la vista con el contexto.
		
									
	}
}