/**
 * 
 */
package Presentación.Clientes;

import javax.swing.JFrame;
import Presentación.Personal.Ventana;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public abstract class VentanaClientes extends JFrame implements Ventana {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private static VentanaClientes instance;

	/** 
	* @return the instance
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public static VentanaClientes getInstance() {
		// begin-user-code
		return instance;
		// end-user-code
	}

	/** 
	* @param instance the instance to set
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public static void setInstance(VentanaClientes instance) {
		// begin-user-code
		VentanaClientes.instance = instance;
		// end-user-code
	}
}