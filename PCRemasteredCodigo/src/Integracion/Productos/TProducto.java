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


	private Integer id;


	public Integer getId() {
		// begin-user-code
		return id;
		// end-user-code
	}


	public void setId(Integer id) {
		// begin-user-code
		this.id = id;
		// end-user-code
	}


	private String nombre;

	
	public String getNombre() {
		// begin-user-code
		return nombre;
		// end-user-code
	}

	public void setNombre(String nombre) {
		// begin-user-code
		this.nombre = nombre;
		// end-user-code
	}


	private String descripcion;


	public String getDescripcion() {
		// begin-user-code
		return descripcion;
		// end-user-code
	}


	public void setDescripcion(String descripcion) {
		// begin-user-code
		this.descripcion = descripcion;
		// end-user-code
	}


	private Integer stock;


	public Integer getStock() {
		// begin-user-code
		return stock;
		// end-user-code
	}


	public void setStock(Integer stock) {
		// begin-user-code
		this.stock = stock;
		// end-user-code
	}


	private float precio;


	public float getPrecio() {
		// begin-user-code
		return precio;
		// end-user-code
	}


	public void setPrecio(float precio) {
		// begin-user-code
		this.precio = precio;
		// end-user-code
	}
}