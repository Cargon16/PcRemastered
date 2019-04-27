/**
 * 
 */
package Integracion.Ventas;

import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_gQWsYEAeEemCgsm7gUtwsg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_gQWsYEAeEemCgsm7gUtwsg"
 */
public class DaoVentasImp implements DaoVentas {

	@Override
	public int create(TVentas venta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TVentas readbyID(int idVenta) {
		
		return null;
	}

	@Override
	public ArrayList<TVentas> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(TVentas venta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int idVenta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int añadirLineaVenta(TVentas venta, int IDProducto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarLineaVenta(TVentas venta, int IDProducto) {
		// TODO Auto-generated method stub
		return 0;
	}
	/** 
	* (non-Javadoc)
	* @see DaoVentas#create()
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_ix80gEAgEemCgsm7gUtwsg?INHERITED"
	*/
	
}