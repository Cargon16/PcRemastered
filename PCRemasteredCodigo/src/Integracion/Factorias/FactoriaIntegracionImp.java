/**
 * 
 */
package Integracion.Factorias;

import Integracion.Clientes.DAOCliente;
import Integracion.Clientes.DAOClienteImpl;
import Integracion.Envios.DAOEnvio;
import Integracion.Envios.DAOEnvioImpl;
import Integracion.Personal.DAOPersonal;
import Integracion.Personal.DAOPersonalImpl;
import Integracion.Productos.DaoProducto;
import Integracion.Productos.DaoProductoImp;
import Integracion.Ventas.DaoVentas;
import Integracion.Ventas.DaoVentasImp;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_knKW4D6lEemCgsm7gUtwsg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_knKW4D6lEemCgsm7gUtwsg"
 */
public class FactoriaIntegracionImp extends FactoriaIntegracion {

	@Override
	public DAOCliente crearDaoCliente() {
		return new DAOClienteImpl();
	}

	@Override
	public DaoVentas crearDaoVenta() {
		return new DaoVentasImp();
		
	}

	@Override
	public DAOEnvio crearDaoEnvios() {
		// TODO Auto-generated method stub
		return new DAOEnvioImpl();
	}

	@Override
	public DaoProducto crearDaoProducto() {
		// TODO Auto-generated method stub
		return new DaoProductoImp();
	}

	@Override
	public DAOPersonal crearDaoPersonal() {
		// TODO Auto-generated method stub
		return new DAOPersonalImpl();
	}


}