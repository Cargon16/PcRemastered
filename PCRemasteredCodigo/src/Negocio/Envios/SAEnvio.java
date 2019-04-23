/**
 * 
 */
package Negocio.Envios;

import Integracion.Envios.TEnvio;
import java.util.Set;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_cfB_MEmHEemqEfCnrOzXGQ"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_cfB_MEmHEemqEfCnrOzXGQ"
*/
public interface SAEnvio {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param TEnvio
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_fKNMAEmHEemqEfCnrOzXGQ"
	*/
	public int create(TEnvio TEnvio);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_rM-aUEmHEemqEfCnrOzXGQ"
	*/
	public TEnvio readByID(int id);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_ycZOYEmHEemqEfCnrOzXGQ"
	*/
	public Set<TEnvio> readAll();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param TEnvio
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_6QIQcEmHEemqEfCnrOzXGQ"
	*/
	public int update(TEnvio TEnvio);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_DcB_UEmIEemqEfCnrOzXGQ"
	*/
	public int delete(int id);
}