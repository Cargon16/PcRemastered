/**
 * 
 */
package Negocio.Factorias;

import Negocio.Clientes.SACliente;
import Negocio.Envios.SAEnvio;
import Negocio.Personal.SAPersonal;
import Negocio.Productos.SAProducto;
import Negocio.Proveedores.SAProveedores;
import Negocio.Ventas.SA;
import Negocio.Ventas.SAVentas;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#___3_8FLnEemG-P2dJpE1PA"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#___3_8FLnEemG-P2dJpE1PA"
*/
public abstract class FactoriaNegocio {
	
	private static FactoriaNegocio instance;

	
	public static FactoriaNegocio getInstance() {
		if ( instance==null){
			instance= new FactoriaNegocioImp();
		}
		return instance;
	
	}


	public abstract SACliente crearSAClientes();

	
	public abstract SAEnvio crearSAEnvios();
	
	public abstract SAPersonal crearSAPersonal();

	
	public abstract SAProducto crearSAProductos();
	
	public abstract SAProveedores crearSAProveedores();

	public abstract SAVentas crearSAVentas();
}