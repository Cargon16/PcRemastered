/**
 * 
 */
package Integracion.Ventas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import Integracion.Clientes.TCliente;


public class TVentas {
	private Integer ID;
	private float precio;
	private Date fecha;
	private Boolean pagado;
	private Boolean devuelto;
	private HashMap<Integer,TLineaVentas> lineasVenta = new HashMap<Integer,TLineaVentas>();
	private Integer IDCliente;
	private Integer IDPersonal;
	public TVentas(Integer iD, float precio, Date fecha, Boolean pagado, Boolean devuelto,
				HashMap<Integer,TLineaVentas> tLineaVentas,int cliente, int idempleado) {
			super();
			this.ID = iD;
			this.precio = precio;
			this.fecha = fecha;
			this.pagado = pagado;
			this.devuelto = devuelto;
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

	public Boolean getDevuelto() {
		return devuelto;
	}

	public void setDevuelto(Boolean devuelto) {
		this.devuelto = devuelto;
	}

	public HashMap<Integer, TLineaVentas> getLineasVenta() {
		return lineasVenta;
	}

	public void setLineasVenta(HashMap<Integer, TLineaVentas> lineasVenta) {
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