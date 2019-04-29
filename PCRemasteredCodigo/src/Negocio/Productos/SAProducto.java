/**
 * 
 */
package Negocio.Productos;

import Integracion.Productos.TProducto;
import java.util.Set;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_elO8EEmaEem-LJ9cS2JMbA"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_elO8EEmaEem-LJ9cS2JMbA"
*/
public interface SAProducto {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param producto
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_gVIMYEmaEem-LJ9cS2JMbA"
	*/
	public int create(TProducto producto) ;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_udU2IEmaEem-LJ9cS2JMbA"
	*/
	public TProducto read(int id) ;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_yZH9UEmaEem-LJ9cS2JMbA"
	*/
	public Set<TProducto> readAll();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Producto
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_9jEtQEmaEem-LJ9cS2JMbA"
	*/
	public int update(TProducto Producto);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param DNI
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_D_8qEEmbEem-LJ9cS2JMbA"
	*/
	public int delete(int DNI);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Nombre
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_QE30gEmbEem-LJ9cS2JMbA"
	*/
	public TProducto readByNombre(String Nombre);
}