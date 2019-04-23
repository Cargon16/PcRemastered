/**
 * 
 */
package Negocio.Clientes;

import java.util.Set;
import Integracion.Clientes.TCliente;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_nDBvIEmXEem-LJ9cS2JMbA"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_nDBvIEmXEem-LJ9cS2JMbA"
*/
public interface SACliente {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param TCliente
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_qvGYQEmXEem-LJ9cS2JMbA"
	*/
	public int create(tCliente TCliente);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_q1Tt8EmXEem-LJ9cS2JMbA"
	*/
	public tCliente read(int id);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_q4-tAEmXEem-LJ9cS2JMbA"
	*/
	public Set<TCliente> readAll();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param tCliente
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_q8de0EmXEem-LJ9cS2JMbA"
	*/
	public int update(TCliente tCliente);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param id
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_rAecIEmXEem-LJ9cS2JMbA"
	*/
	public int delete(int id);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param DNI
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_VHGDIEmZEem-LJ9cS2JMbA"
	*/
	public tCliente readByDNI(String DNI);
}