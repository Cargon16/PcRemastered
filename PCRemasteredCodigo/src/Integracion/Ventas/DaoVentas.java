/**
 * 
 */
package Integracion.Ventas;

import java.util.ArrayList;
import java.util.HashMap;

import Integracion.Productos.TProducto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_kH0tMEAeEemCgsm7gUtwsg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_kH0tMEAeEemCgsm7gUtwsg"
 */
public interface DaoVentas {
	
	public int create(TVentas venta);

	public TVentas readbyID(int idVenta);

	public ArrayList<TVentas> readAll();
	
	public int update( TVentas venta);

	public int delete( int idVenta);
	
	public int anadirLineaVenta(TVentas venta, int IDProducto);
	
	public int eliminarLineaVenta(TVentas venta, int IDProducto);
	
}