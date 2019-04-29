
package Integracion.Envios;

public class TEnvio {

	public TEnvio(int iD, Boolean estado, String direccion) {
		super();
		ID = iD;
		Estado = estado;
		Direccion = direccion;
	}

	private int ID;
	private Boolean Estado;
	private String Direccion;

	public int getID() {
		// begin-user-code
		return ID;
		// end-user-code
	}

	public void setID(int ID) {
		// begin-user-code
		this.ID = ID;
		// end-user-code
	}

	public String getDireccion() {
		// begin-user-code
		return Direccion;
		// end-user-code
	}

	public void setDireccion(String Direccion) {
		// begin-user-code
		this.Direccion = Direccion;
		// end-user-code
	}

	public Boolean isEstado() {
		// begin-user-code
		return Estado;
		// end-user-code
	}

	public void setEstado(Boolean Estado) {
		// begin-user-code
		this.Estado = Estado;
		// end-user-code
	}
}