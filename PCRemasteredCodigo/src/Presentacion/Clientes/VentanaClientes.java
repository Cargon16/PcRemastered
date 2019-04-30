/**
 * 
 */
package Presentacion.Clientes;

import javax.swing.JFrame;

import Presentacion.Ventana;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_DBsScFOpEemH9v7SOzgnzQ"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_DBsScFOpEemH9v7SOzgnzQ"
*/
public abstract class VentanaClientes extends JFrame implements Ventana{
	private static final long serialVersionUID = 1L;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_HhjwAFOpEemH9v7SOzgnzQ"
	*/
	private static VentanaClientes instance;

	/** 
	* @return the instance
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_HhjwAFOpEemH9v7SOzgnzQ?GETTER"
	*/
	public static VentanaClientes getInstance() {
		if ( instance==null){
			instance = new VentanaClientesImp();
		}
		return instance;
	}

}