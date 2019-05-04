/**
 * 
 */
package Integracion.Productos;

import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_dzzuQEAaEemCgsm7gUtwsg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_dzzuQEAaEemCgsm7gUtwsg"
 */
public interface DaoProducto {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_fponcEAaEemCgsm7gUtwsg"
	*/
	public Integer create(TProducto tProducto);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_fvLOwEAaEemCgsm7gUtwsg"
	*/
	public TProducto read(int id);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	 * @return 
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_fw-lkEAaEemCgsm7gUtwsg"
	*/
	public ArrayList<TProducto> readAll();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_fyLfcEAaEemCgsm7gUtwsg"
	*/
	public int delete(int id);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_fzyB8EAaEemCgsm7gUtwsg"
	*/
	public int update(TProducto tProducto);
	
	public TProducto readByID(int Id);

	public TProducto readByNombre(String nombre);

	
}