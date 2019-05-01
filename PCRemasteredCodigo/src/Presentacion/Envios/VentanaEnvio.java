/**
 * 
 */
package Presentacion.Envios;

import javax.swing.JFrame;

import Presentacion.Ventana;
import Presentacion.Clientes.VentanaClientes;
import Presentacion.Clientes.VentanaClientesImp;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_aIn_kFLqEemG-P2dJpE1PA"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_aIn_kFLqEemG-P2dJpE1PA"
*/
public abstract class VentanaEnvio extends JFrame implements Ventana {
private static final long serialVersionUID = 1L;
	
	private static VentanaEnvio instance = null;

	
	public static VentanaEnvio getInstance() {
		if ( instance==null){
			instance = new VentanaEnvioImp();
		}
		return instance;
	}


	public static void setInstance(Object object) {
		// TODO Auto-generated method stub
		instance=null;
	}
}