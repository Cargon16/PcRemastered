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

	/** 
	* @return the instance
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_lrP8AD6jEemCgsm7gUtwsg?GETTER"
	*/
	public static synchronized FactoriaIntegracion getInstance() {
		if (instance== null){
			instance = new FactoriaIntegracionImp();
		}
		return instance;
	}

	/** 
	* @param instance the instance to set
	 * @return 
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_lrP8AD6jEemCgsm7gUtwsg?SETTER"
	*/

	public abstract DAOCliente crearDaoCliente() ;


	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	 * @return 
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_EXgvgEAZEemCgsm7gUtwsg"
	*/
	public abstract DaoVentas crearDaoVenta() ; 
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	 * @return 
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_ExbEUEAZEemCgsm7gUtwsg"
	*/
	public abstract DAOEnvio crearDaoEnvios() ;
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	 * @return 
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_FrPBMEAZEemCgsm7gUtwsg"
	*/
	public abstract DaoProducto crearDaoProducto() ;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	 * @return 
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_GASrMEAZEemCgsm7gUtwsg"
	*/
	public abstract DAOPersonal crearDaoPersonal();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	 * @return 
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_MuiE0EAZEemCgsm7gUtwsg"
	*/
	public abstract DaoProveedores crearDaoProveedroes();
}