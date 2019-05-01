/**
 * 
 */
package Integracion.Clientes;

public class TCliente {

	private Integer ID;
	private Boolean activo;
	private Integer telefono;
	private String nombre;
	private String direccion;
	private String DNI;

	public TCliente(Integer ID, String DNI,String nombre,Integer telefono,  String direccion,  Boolean activo) {
		this.ID = ID;
		this.telefono = telefono;
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = DNI;
		this.activo = activo;
	}
	
	public Integer getID() {
		// begin-user-code
		return ID;
		// end-user-code
	}

	
	public void setID(Integer ID) {
		// begin-user-code
		this.ID = ID;
		// end-user-code
	}

	public Integer getTelefono() {
		// begin-user-code
		return telefono;
		// end-user-code
	}

	public void setTelefono(Integer telefono) {
		// begin-user-code
		this.telefono = telefono;
		// end-user-code
	}

	public String getNombre() {
		// begin-user-code
		return this.nombre;
		// end-user-code
	}

	
	public void setNombre(String nombre) {
		// begin-user-code
		this.nombre = nombre;
		// end-user-code
	}

	
	public String getDireccion() {
		// begin-user-code
		return direccion;
		// end-user-code
	}

	
	public void setDireccion(String direccion) {
		// begin-user-code
		this.direccion = direccion;
		// end-user-code
	}

	
	public String getDNI() {
		// begin-user-code
		return DNI;
		// end-user-code
	}


	public void setDNI(String DNI) {
		// begin-user-code
		this.DNI = DNI;
		// end-user-code
	}

	public Boolean isActivo() {
		// begin-user-code
		return activo;
		// end-user-code
	}

	public void setActivo(boolean activo) {
		// begin-user-code
		this.activo = activo;
		// end-user-code
	}


}
