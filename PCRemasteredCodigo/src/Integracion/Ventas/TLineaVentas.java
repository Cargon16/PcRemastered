/**
 * 
 */
package Integracion.Ventas;

import Integracion.Productos.TProducto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_uT8tgEAfEemCgsm7gUtwsg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_uT8tgEAfEemCgsm7gUtwsg"
 */
public class TLineaVentas {

	
	

	private Integer IDVenta;

	private Integer IDProducto;

	private Integer cantidad;


	

	public TLineaVentas(Integer iDVenta, Integer iDProducto, Integer cantidad) {
		super();
		this.IDVenta = iDVenta;
		this.IDProducto = iDProducto;
		this.cantidad = cantidad;
	}

	public Integer getIDVenta() {
		return IDVenta;
	}

	public void setIDVenta(Integer iDVenta) {
		IDVenta = iDVenta;
	}

	public Integer getIDProducto() {
		return IDProducto;
	}

	public void setIDProducto(Integer iDProducto) {
		IDProducto = iDProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	
	/** 
	* @return the tVentas
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_GrHFoEAgEemCgsm7gUtwsg?GETTER"
	*/
	
}