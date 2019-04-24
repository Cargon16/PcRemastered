/**
 * 
 */
package Integracion.Factorias;

import Integracion.Clientes.DAOCliente;
import Integracion.Envios.DAOEnvio;
import Integracion.Personal.DAOPersonal;
import Integracion.Productos.DaoProducto;
import Integracion.Proveedores.DaoProveedores;
import Integracion.Ventas.DaoVentas;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_jJ_gMD6jEemCgsm7gUtwsg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_jJ_gMD6jEemCgsm7gUtwsg"
 */
public abstract class FactoriaIntegracion {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_lrP8AD6jEemCgsm7gUtwsg"
	*/
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
	
	public abstract DaoProveedores crearDaoProveedroes();
}