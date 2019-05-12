/**
 * 
 */
package Presentacion.Ventas;

import javax.swing.JDialog;
import javax.swing.JFrame;

import Presentacion.Ventana;
import Presentacion.Clientes.VentanaClientes;
import Presentacion.Clientes.VentanaClientesImp;
import Presentacion.Command.Contexto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_Fa07AlMPEemdZLpuw9I4eQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_Fa07AlMPEemdZLpuw9I4eQ"
 */
public abstract class PanelPago extends JDialog implements Ventana{
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_Fa07BFMPEemdZLpuw9I4eQ"
	*/
private static final long serialVersionUID = 1L;
	
	private static PanelPagoImp instance = null;

	
	public static PanelPagoImp getInstance() {
		if ( instance==null){
			instance = new PanelPagoImp();
		}
		return instance;
	}


	public static void setInstance(Object object) {
		// TODO Auto-generated method stub
		instance=null;
	
	}


}