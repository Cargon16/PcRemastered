/**
 * 
 */
package Negocio.Personal;

import Integracion.Personal.TPersonal;
import java.util.Set;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_iunzwFLkEemG-P2dJpE1PA"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_iunzwFLkEemG-P2dJpE1PA"
*/
public interface SAPersonal {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param TPersonal
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_mWcPAFLkEemG-P2dJpE1PA"
	*/
	public int create(TPersonal TPersonal);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_C3N18FLnEemG-P2dJpE1PA"
	*/
	public TPersonal read(int id);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_GAPcYFLnEemG-P2dJpE1PA"
	*/
	public Set<TPersonal> readAll();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param tPersonal
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_K0iR0FLnEemG-P2dJpE1PA"
	*/
	public int update(TPersonal tPersonal);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_OhnnkFLnEemG-P2dJpE1PA"
	*/
	public int delete(int id);
}