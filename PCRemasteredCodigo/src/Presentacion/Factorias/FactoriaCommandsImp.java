/**
 * 
 */
package Presentacion.Factorias;

import Presentacion.Command.Command;
import Presentacion.Command.Evento;
import Presentacion.Command.Cliente.CreateClienteCommand;
import Presentacion.Command.Vista.CrearVentanaClienteCommand;
import Presentacion.Command.Vista.InitCommand;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_wP6HMFSUEemuHuD_HqBchg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_wP6HMFSUEemuHuD_HqBchg"
 */
public class FactoriaCommandsImp extends FactoriaCommands {

	@Override
	public Command generacionCommand(Evento evento) {
		// TODO Auto-generated method stub
		Command c = null;
		switch (evento){
		case INIT : return new InitCommand();
		case crearVentanaCliente: return new CrearVentanaClienteCommand();
		case createClienteCommnad: return new CreateClienteCommand();
		default : return null;
		}
	}
	
}