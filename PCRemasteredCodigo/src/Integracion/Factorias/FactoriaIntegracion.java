/**
 * 
 */
package Integracion.Factorias;

import Integracion.Clientes.DAOCliente;
import Integracion.Envios.DAOEnvio;
import Integracion.Personal.DAOPersonal;
import Integracion.Productos.DaoProducto;
import Integracion.Ventas.DaoVentas;

public abstract class FactoriaIntegracion {

	private static FactoriaIntegracion instance;

	
	public static synchronized FactoriaIntegracion getInstance() {
		if (instance== null){
			instance = new FactoriaIntegracionImp();
		}
		return instance;
	}
	public abstract DAOCliente crearDaoCliente() ;

	public abstract DaoVentas crearDaoVenta() ; 
	
	public abstract DAOEnvio crearDaoEnvios() ;

	public abstract DaoProducto crearDaoProducto() ;

	public abstract DAOPersonal crearDaoPersonal();
	
}