
package Integracion.Envios;

public class TEnvio {

	public TEnvio(Integer iD, Boolean estado, String direccion, Integer IdVenta) {
		super();
		ID = iD;
		Estado = estado;
		Direccion = direccion;
		this.IdVenta = IdVenta;
	}

	public Integer getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(Integer idVenta) {
		IdVenta = idVenta;
	}

	private Integer ID;
	private Boolean Estado;
	private String Direccion;
	private Integer IdVenta;

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