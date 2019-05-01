/**
 * 
 */
package Presentacion.Factorias;

import Presentacion.Command.Command;
import Presentacion.Command.Evento;
import Presentacion.Command.Cliente.CreateClienteCommand;
import Presentacion.Command.Cliente.DeleteClienteCommand;
import Presentacion.Command.Cliente.ReadAllClienteCommand;
import Presentacion.Command.Cliente.ReadByDNIClienteCommand;
import Presentacion.Command.Cliente.ReadClienteCommand;
import Presentacion.Command.Cliente.UpdateClienteCommand;
import Presentacion.Command.Envios.CreateEnviosCommand;
import Presentacion.Command.Envios.DeleteEnviosCommand;
import Presentacion.Command.Envios.ReadAllEnviosCommand;
import Presentacion.Command.Envios.ReadByIDEnviosCommand;
import Presentacion.Command.Envios.UpdateEnviosCommand;
import Presentacion.Command.Personal.CreatePersonalCommand;
import Presentacion.Command.Personal.DeletePersonalCommand;
import Presentacion.Command.Personal.ReadAllPersonalCommand;
import Presentacion.Command.Personal.ReadPersonalCommand;
import Presentacion.Command.Personal.UpdatePersonalCommand;
import Presentacion.Command.Productos.CreateProductosCommand;
import Presentacion.Command.Productos.DeleteProductosCommand;
import Presentacion.Command.Productos.ReadAllProductosCommand;
import Presentacion.Command.Productos.ReadByNombrePRoductosCommand;
import Presentacion.Command.Productos.ReadProductosCommand;
import Presentacion.Command.Productos.UpdateProductosCommand;
import Presentacion.Command.Proveedores.CreateProveedoresCommand;
import Presentacion.Command.Proveedores.DeleteProveedoresCommand;
import Presentacion.Command.Proveedores.ReadAllProveedoresCommand;
import Presentacion.Command.Proveedores.ReadProveedoresCommand;
import Presentacion.Command.Proveedores.UpdateProveedoresCommand;
import Presentacion.Command.Ventas.CreateVentasCommand;
import Presentacion.Command.Ventas.DeleteVentasCommand;
import Presentacion.Command.Ventas.ReadAllVentasCommand;
import Presentacion.Command.Ventas.ReadVentasCommand;
import Presentacion.Command.Ventas.UpdateVentasCommand;
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
		case deleteClienteCommand: return new DeleteClienteCommand();
		case readAllClienteCommand: return new ReadAllClienteCommand();
		case readByDNIClienteCommand: return new ReadByDNIClienteCommand();
		case readClienteCommand: return new ReadClienteCommand();
		case updateClienteCommand:return new UpdateClienteCommand();
		case crearVentanaProducto: return new CrearVentanaProductoCommand();
		case createProductoCommand: return new CreateProductosCommand();
		case deleteProductoCommand: return new DeleteProductosCommand();
		case readAllProductoCommand: return new ReadAllProductosCommand();
		case readByNombreProductoCommand: return new ReadByNombrePRoductosCommand();
		case readProductoCommand: return new ReadProductosCommand();
		case updateProductoCommand:return new UpdateProductosCommand();
		case crearVentanaPersonal: return new CrearVentanaPersonalCommand();
		case createPersonalCommand: return new CreatePersonalCommand();
		case deletePersonalCommand: return new DeletePersonalCommand();
		case readAllPersonalCommand: return new ReadAllPersonalCommand();
		case readPersonalCommand: return new ReadPersonalCommand();
		case updatePersonalCommand:return new UpdatePersonalCommand();
		case crearVentanaEnvio: return new CrearVentanaEnvioCommand();
		case createEnvioCommand: return new CreateEnviosCommand();
		case deleteEnvioCommand: return new DeleteEnviosCommand();
		case readAllEnvioCommand: return new ReadAllEnviosCommand();
		case readEnvioCommand: return new ReadByIDEnviosCommand();
		case updateEnvioCommand:return new UpdateEnviosCommand();
		case crearVentanaProveedores: return new CrearVentanaProveedoresCommand();
		case createProveedorCommand: return new CreateProveedoresCommand();
		case deleteProveedorCommand: return new DeleteProveedoresCommand();
		case readAllProveedorCommand: return new ReadAllProveedoresCommand();
		case readProveedorCommand: return new ReadProveedoresCommand();
		case updateProveedorCommand:return new UpdateProveedoresCommand();
		case crearVentanaVentas: return new CrearVentanaVentasCommand();
		case createVentasCommand: return new CreateVentasCommand();
		case deleteVentasCommand: return new DeleteVentasCommand();
		case readAllVentasCommand: return new ReadAllVentasCommand();
		case readVentasCommand: return new ReadVentasCommand();
		case updateVentasCommand:return new UpdateVentasCommand();
		
		default : return null;
		}
	}
	
}