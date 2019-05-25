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
import Presentacion.Command.Personal.LoginCommand;
import Presentacion.Command.Personal.ReadAllPersonalCommand;
import Presentacion.Command.Personal.ReadPersonalCommand;
import Presentacion.Command.Personal.UpdatePersonalCommand;
import Presentacion.Command.Productos.CreateProductosCommand;
import Presentacion.Command.Productos.DeleteProductosCommand;
import Presentacion.Command.Productos.ReadAllProductosCommand;
import Presentacion.Command.Productos.ReadByIdProductosCommand;
import Presentacion.Command.Productos.ReadProductosCommand;
import Presentacion.Command.Productos.UpdateProductosCommand;
import Presentacion.Command.Ventas.AbrirVentaCommand;
import Presentacion.Command.Ventas.AnadirProductoVentaCommand;
import Presentacion.Command.Ventas.CreateVentasCommand;
import Presentacion.Command.Ventas.DeleteVentasCommand;
import Presentacion.Command.Ventas.EliminarProductoVentaCommand;
import Presentacion.Command.Ventas.PagoProductoVentaCommand;
import Presentacion.Command.Ventas.ProcesarCompraCommand;
import Presentacion.Command.Ventas.ReadAllVentasCommand;
import Presentacion.Command.Ventas.ReadVentasCommand;
import Presentacion.Command.Ventas.UpdateVentasCommand;
import Presentacion.Command.Ventas.VincularClienteVentaCommand;
import Presentacion.Command.Vista.InitCommand;
import Presentacion.Command.Vista.LoginCommandActualizar;
import Presentacion.Command.Vista.VentanaClienteCommand;
import Presentacion.Command.Vista.VentanaEnvioCommand;
import Presentacion.Command.Vista.VentanaPagoCommand;
import Presentacion.Command.Vista.VentanaPersonalCommand;
import Presentacion.Command.Vista.VentanaProductosCommand;
import Presentacion.Command.Vista.VentanaVentasCommand;
import Presentacion.Ventas.PanelPago;


public class FactoriaCommandsImp extends FactoriaCommands {

	@Override
	public Command generacionCommand(Evento evento) {
		// TODO Auto-generated method stub
		Command c = null;
		switch (evento){
		case INIT : return new InitCommand(); 
		case VentanaCliente: return new VentanaClienteCommand(); 
		case createClienteCommnad: return new CreateClienteCommand();
		case deleteClienteCommand: return new DeleteClienteCommand();
		case readAllClienteCommand: return new ReadAllClienteCommand();
		case readByDNIClienteCommand: return new ReadByDNIClienteCommand();
		case readClienteCommand: return new ReadClienteCommand();
		case updateClienteCommand:return new UpdateClienteCommand();
		case crearVentanaProductos: return new VentanaProductosCommand();
		case createProductoCommand: return new CreateProductosCommand();
		case deleteProductoCommand: return new DeleteProductosCommand();
		case readAllProductoCommand: return new ReadAllProductosCommand();
		case readByIDProductosCommand: return new ReadByIdProductosCommand();
		case readProductoCommand: return new ReadProductosCommand();
		case updateProductoCommand:return new UpdateProductosCommand();
		case crearVentanaPersonal: return new VentanaPersonalCommand();
		case createPersonalCommand: return new CreatePersonalCommand();
		case deletePersonalCommand: return new DeletePersonalCommand();
		case readAllPersonalCommand: return new ReadAllPersonalCommand();
		case readPersonalCommand: return new ReadPersonalCommand();
		case updatePersonalCommand:return new UpdatePersonalCommand();
		case crearVentanaEnvios: return new VentanaEnvioCommand();
		case createEnvioCommand: return new CreateEnviosCommand();
		case deleteEnvioCommand: return new DeleteEnviosCommand();
		case readAllEnvioCommand: return new ReadAllEnviosCommand();
		case readEnvioCommand: return new ReadByIDEnviosCommand();
		case updateEnvioCommand:return new UpdateEnviosCommand();
		case crearVentanaVentas: return new VentanaVentasCommand();
		case createVentasCommand: return new CreateVentasCommand();
		case deleteVentasCommand: return new DeleteVentasCommand();
		case readAllVentasCommand: return new ReadAllVentasCommand();
		case readVentasCommand: return new ReadVentasCommand();
		case updateVentasCommand:return new UpdateVentasCommand();
		case abrirVentaCommand: return new AbrirVentaCommand();
		case addProductoVentaCommand: return new AnadirProductoVentaCommand();
		case DeleteProductoVentaCommand: return new EliminarProductoVentaCommand();
		case Login : return new LoginCommandActualizar();
		case loginCommand: return new LoginCommand();
		case procesarVenta: return new ProcesarCompraCommand();
		case crearVentanaPago: return new VentanaPagoCommand();
		case PagoProductoVentaCommand: return new PagoProductoVentaCommand();
		case VincularClienteVentaCommand: return new VincularClienteVentaCommand();
		default : return null;
		}
	}
	
}