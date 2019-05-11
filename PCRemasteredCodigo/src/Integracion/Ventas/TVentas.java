/**
 * 
 */
package Integracion.Ventas;

import java.sql.Date;
import java.util.HashMap;


public class TVentas {
	private Integer ID;
	private float precio;
	private Date fecha;
	private Boolean pagado;
	private HashMap<Integer,Integer> lineasVenta = new HashMap<Integer,Integer>();
	private Integer IDCliente;
	private Integer IDPersonal;
	public TVentas(Integer iD, float precio, Date fecha, Boolean pagado,
				HashMap<Integer,Integer> tLineaVentas,Integer cliente, Integer idempleado) {
			super();
			this.ID = iD;
			this.precio = precio;
			this.fecha = fecha;
			this.pagado = pagado;
			this.lineasVenta = tLineaVentas;
			this.IDCliente = cliente;
			this.IDPersonal = idempleado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Boolean getPagado() {
		return pagado;
	}

	public void setPagado(Boolean pagado) {
		this.pagado = pagado;
	}


	public HashMap<Integer, Integer> getLineasVenta() {
		return lineasVenta;
	}

	public void setLineasVenta(HashMap<Integer, Integer> lineasVenta) {
		this.lineasVenta = lineasVenta;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getIDCliente() {
		return IDCliente;
	}

	public void setIDCliente(Integer iDCliente) {
		IDCliente = iDCliente;
	}


	public Integer getIDPersonal() {
		return IDPersonal;
	}

	public void setIDPersonal(Integer iDPersonal) {
		IDPersonal = iDPersonal;
	}
		
}