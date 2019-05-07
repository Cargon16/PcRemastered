/**
 * 
 */
package Negocio.Clientes;

import java.util.ArrayList;

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

	public int create(TCliente TCliente);

	
	public TCliente read(int id);


	public ArrayList<TCliente> readAll();

	
	public int update(TCliente tCliente);


	public int delete(int id);


	public TCliente readByDNI(String DNI);
}