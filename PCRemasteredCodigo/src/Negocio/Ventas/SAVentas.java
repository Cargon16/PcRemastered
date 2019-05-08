/**
 * 
 */
package Negocio.Ventas;

import java.util.ArrayList;

import Integracion.Productos.TProducto;
import Integracion.Ventas.TVentas;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_o8GnEEmLEemqEfCnrOzXGQ"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_o8GnEEmLEemqEfCnrOzXGQ"
*/
public interface SAVentas {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param tVenta
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_1A3ZcEmLEemqEfCnrOzXGQ"
	*/
	public int create(TVentas tVenta);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_CQYuwEmMEemqEfCnrOzXGQ"
	*/
	public TVentas read(int id);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_F55zIEmMEemqEfCnrOzXGQ"
	*/
	public ArrayList<TVentas> readAll();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param tVenta
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_MLSRoEmMEemqEfCnrOzXGQ"
	*/
	public int update(TVentas tVenta);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @param producto
	* @param cantidad
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_TtyZwEmMEemqEfCnrOzXGQ"
	*/
	public TVentas addCesta(int id, TProducto producto, int cantidad);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @param producto
	* @param cantidad
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_jfHkgEmMEemqEfCnrOzXGQ"
	*/
	public TVentas removeCesta(int id, TProducto producto, int cantidad);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_tlafEEmMEemqEfCnrOzXGQ"
	*/
	public int devolucion(int id);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_4awQ8EmMEemqEfCnrOzXGQ"
	*/
	public int closeVenta(int id);

	public TVentas AddProductoVenta(int idVenta, int producto, int cantidad);

	public TVentas DeleteProductoVenta(int idVenta, int producto);
}