/**
 * 
 */
package Negocio.Clientes;

import java.util.ArrayList;
import java.util.Set;
import Integracion.Clientes.TCliente;
import Negocio.ComprobadorSintactico.ComprobadorSintactico;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_6dHT0EmYEem-LJ9cS2JMbA"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_6dHT0EmYEem-LJ9cS2JMbA"
*/
public class SAClienteImp implements SACliente {
	/** 
	* (non-Javadoc)
	* @see SACliente#create(tCliente TCliente)
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_qvGYQEmXEem-LJ9cS2JMbA?INHERITED"
	*/
	public int create(TCliente cliente) {
		
		if(cliente!=null){
			
		}
		return cliente.getID();
	
	}
	
	public TCliente read(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see SACliente#readAll()
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_q4-tAEmXEem-LJ9cS2JMbA?INHERITED"
	*/
	public ArrayList<TCliente> readAll() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see SACliente#update(TCliente tCliente)
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_q8de0EmXEem-LJ9cS2JMbA?INHERITED"
	*/
	public int update(TCliente tCliente) {
		// begin-user-code
		// TODO Auto-generated method stub
		return 0;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see SACliente#delete(int id)
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_rAecIEmXEem-LJ9cS2JMbA?INHERITED"
	*/
	public int delete(int id) {
		// begin-user-code
		// TODO Auto-generated method stub
		return 0;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see SACliente#readByDNI(String DNI)
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_VHGDIEmZEem-LJ9cS2JMbA?INHERITED"
	*/
	public TCliente readByDNI(String DNI) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}


}