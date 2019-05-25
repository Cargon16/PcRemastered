/**
 * 
 */
package Negocio.Factorias;

import Negocio.Clientes.SACliente;
import Negocio.Clientes.SAClienteImp;
import Negocio.Envios.SAEnvio;
import Negocio.Envios.SAEnvioImp;
import Negocio.Personal.SAPersonal;
import Negocio.Personal.SAPersonalImp;
import Negocio.Productos.SAProducto;
import Negocio.Productos.SAProductoImp;
import Negocio.Ventas.SAVentas;
import Negocio.Ventas.SAVentasImp;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_z8OycFLoEemG-P2dJpE1PA"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_z8OycFLoEemG-P2dJpE1PA"
 */
public class FactoriaNegocioImp extends FactoriaNegocio {

	@Override
	public SACliente crearSAClientes() {
		// TODO Auto-generated method stub
		return new SAClienteImp();
	}

	@Override
	public SAEnvio crearSAEnvios() {
		// TODO Auto-generated method stub
		return new SAEnvioImp();
	}

	@Override
	public SAPersonal crearSAPersonal() {
		// TODO Auto-generated method stub
		return new SAPersonalImp();
	}

	@Override
	public SAProducto crearSAProductos() {
		// TODO Auto-generated method stub
		return new SAProductoImp();
	}

	@Override
	public SAVentas crearSAVentas() {
		// TODO Auto-generated method stub
		return new SAVentasImp();
	}
}