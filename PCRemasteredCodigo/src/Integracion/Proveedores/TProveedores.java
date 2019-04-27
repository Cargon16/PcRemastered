/**
 * 
 */
package Integracion.Proveedores;

import java.util.Set;


public class TProveedores {
	
	private Integer ID;
	private boolean activo;
	private int telefono;
	private String Nombre;
	private String DNI;

	
	public TProveedores(String Nombre, Integer telefono, Boolean activo, String DNI, Integer ID) {
		this.ID = ID;
		this.telefono = telefono;
		this.Nombre = Nombre;
		this.DNI = DNI;
		this.activo = activo;
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

	public String getNombre() {
		// begin-user-code
		return Nombre;
		// end-user-code
	}

	public void setNombre(String Nombre) {
		// begin-user-code
		this.Nombre = Nombre;
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
	
	public Boolean isActivo() {
		// begin-user-code
		return activo;
		// end-user-code
	}

	public void setActivo(Boolean activo) {
		// begin-user-code
		this.activo = activo;
		// end-user-code
	}
	
	private Set<TLineaProveedor> tLineaProveedor;

	public Set<TLineaProveedor> gettLineaProveedor() {
		// begin-user-code
		return tLineaProveedor;
		// end-user-code
	}

	public void settLineaProveedor(Set<TLineaProveedor> tLineaProveedor) {
		// begin-user-code
		this.tLineaProveedor = tLineaProveedor;
		// end-user-code
	}

}