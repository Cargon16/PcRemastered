/**
 * 
 */
package Negocio.Proveedores;

import Integracion.Proveedores.TProveedores;
import java.util.Set;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_WvX9oEmbEemGrfQ_CenZZA"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_WvX9oEmbEemGrfQ_CenZZA"
*/
public interface SAProveedores {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param tproveedor
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_olY88EmbEemGrfQ_CenZZA"
	*/
	public int create(TProveedores tproveedor);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_80MYkEmbEemGrfQ_CenZZA"
	*/
	public TProveedores read(int id);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_WXS_YEmcEemGrfQ_CenZZA"
	*/
	public Set<TProveedores> readAll();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param tproveedor
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_eBfq8EmcEemGrfQ_CenZZA"
	*/
	public int update(TProveedores tproveedor);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_wmSb0EmcEemGrfQ_CenZZA"
	*/
	public int delete(int id);
}