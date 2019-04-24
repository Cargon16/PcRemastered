/**
 * 
 */
package Integracion.Personal;


public class TPersonal {

	public TPersonal(String pass, Boolean activo, Double salario, Integer iD, Integer telefono, String nombre) {
		super();
		Pass = pass;
		Activo = activo;
		Salario = salario;
		ID = iD;
		Telefono = telefono;
		Nombre = nombre;
	}

	private String Pass;
	private Boolean Activo;
	private Double Salario;
	private Integer ID;
	private Integer Telefono;
	private String Nombre;
	
	

	public String getPass() {
		// begin-user-code
		return Pass;
		// end-user-code
	}

	public void setPass(String Pass) {
		// begin-user-code
		this.Pass = Pass;
		// end-user-code
	}

	public Double getSalario() {
		// begin-user-code
		return Salario;
		// end-user-code
	}

	public void setSalario(Double Salario) {
		// begin-user-code
		this.Salario = Salario;
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


	public Integer getTelefono() {
		// begin-user-code
		return Telefono;
		// end-user-code
	}

	public void setTelefono(Integer Telefono) {
		// begin-user-code
		this.Telefono = Telefono;
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


	public Boolean isActivo() {
		// begin-user-code
		return Activo;
		// end-user-code
	}

	public void setActivo(Boolean Activo) {
		// begin-user-code
		this.Activo = Activo;
		// end-user-code
	}
}