/**
 * 
 */
package Integracion.Clientes;

import java.util.ArrayList;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_E4VOoD6aEemCgsm7gUtwsg"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_E4VOoD6aEemCgsm7gUtwsg"
*/
public interface DAOCliente {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P2lr8D6aEemCgsm7gUtwsg"
	*/
	public Integer create(TCliente tCliente);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P5t4cD6aEemCgsm7gUtwsg"
	*/
	public TCliente readByID(int id);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P82E8D6aEemCgsm7gUtwsg"
	*/
	public ArrayList<TCliente> readAll();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_QFNWwD6aEemCgsm7gUtwsg"
	*/
	public int update(TCliente cliente);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	 * @return 
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_QNWmID6aEemCgsm7gUtwsg"
	*/
	public int delete(int id);
	public TCliente readByDNI(String DNI);
}