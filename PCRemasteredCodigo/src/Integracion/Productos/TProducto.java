/**
 * 
 */
package Integracion.Productos;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_quAT0EAaEemCgsm7gUtwsg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_quAT0EAaEemCgsm7gUtwsg"
 */
public class TProducto {
	public TProducto(Integer id, String nombre, String descripcion, Integer stock, float precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_szD70EAaEemCgsm7gUtwsg"
	*/
	private Integer id;

	/** 
	* @return the id
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_szD70EAaEemCgsm7gUtwsg?GETTER"
	*/
	public Integer getId() {
		// begin-user-code
		return id;
		// end-user-code
	}

	/** 
	* @param id the id to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_szD70EAaEemCgsm7gUtwsg?SETTER"
	*/
	public void setId(Integer id) {
		// begin-user-code
		this.id = id;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_tGi4gEAaEemCgsm7gUtwsg"
	*/
	private String nombre;

	/** 
	* @return the nombre
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_tGi4gEAaEemCgsm7gUtwsg?GETTER"
	*/
	public String getNombre() {
		// begin-user-code
		return nombre;
		// end-user-code
	}

	/** 
	* @param nombre the nombre to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_tGi4gEAaEemCgsm7gUtwsg?SETTER"
	*/
	public void setNombre(String nombre) {
		// begin-user-code
		this.nombre = nombre;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_tKRh8EAaEemCgsm7gUtwsg"
	*/
	private String descripcion;

	/** 
	* @return the descripcion
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_tKRh8EAaEemCgsm7gUtwsg?GETTER"
	*/
	public String getDescripcion() {
		// begin-user-code
		return descripcion;
		// end-user-code
	}

	/** 
	* @param descripcion the descripcion to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_tKRh8EAaEemCgsm7gUtwsg?SETTER"
	*/
	public void setDescripcion(String descripcion) {
		// begin-user-code
		this.descripcion = descripcion;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_tOLKgEAaEemCgsm7gUtwsg"
	*/
	private Integer stock;

	/** 
	* @return the stock
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_tOLKgEAaEemCgsm7gUtwsg?GETTER"
	*/
	public Integer getStock() {
		// begin-user-code
		return stock;
		// end-user-code
	}

	/** 
	* @param stock the stock to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_tOLKgEAaEemCgsm7gUtwsg?SETTER"
	*/
	public void setStock(Integer stock) {
		// begin-user-code
		this.stock = stock;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_7vL84EAaEemCgsm7gUtwsg"
	*/
	private float precio;

	/** 
	* @return the precio
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_7vL84EAaEemCgsm7gUtwsg?GETTER"
	*/
	public float getPrecio() {
		// begin-user-code
		return precio;
		// end-user-code
	}

	/** 
	* @param precio the precio to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_7vL84EAaEemCgsm7gUtwsg?SETTER"
	*/
	public void setPrecio(float precio) {
		// begin-user-code
		this.precio = precio;
		// end-user-code
	}
}