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
	
	private float precio;
	private Date fecha;
	private Boolean pagado;
	private Boolean devuelto;
	private HashMap<Integer,TLineaVentas> lineasVenta = new HashMap<Integer,TLineaVentas>();
	private TCliente cliente;
	private Integer ID;
	
	public TVentas(Integer iD, float precio, Date fecha, Boolean pagado, Boolean devuelto,
				HashMap<Integer,TLineaVentas> tLineaVentas,TCliente cliente) {
			super();
			this.ID = iD;
			this.precio = precio;
			this.fecha = fecha;
			this.pagado = pagado;
			this.devuelto = devuelto;
			this.lineasVenta = tLineaVentas;
			this.cliente = cliente;
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

	public TCliente getCliente() {
		return cliente;
	}

	public void setCliente(TCliente cliente) {
		this.cliente = cliente;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}
		
}