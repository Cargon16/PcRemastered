/**
 * 
 */
package Integración.Ventas;

import java.util.Set;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class TVentas {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Integer ID;

	/** 
	* @return the ID
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Integer getID() {
		// begin-user-code
		return ID;
		// end-user-code
	}

	/** 
	* @param ID the ID to set
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setID(Integer ID) {
		// begin-user-code
		this.ID = ID;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float precio;

	/** 
	* @return the precio
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getPrecio() {
		// begin-user-code
		return precio;
		// end-user-code
	}

	/** 
	* @param precio the precio to set
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPrecio(float precio) {
		// begin-user-code
		this.precio = precio;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Date fecha;

	/** 
	* @return the fecha
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Date getFecha() {
		// begin-user-code
		return fecha;
		// end-user-code
	}

	/** 
	* @param fecha the fecha to set
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setFecha(Date fecha) {
		// begin-user-code
		this.fecha = fecha;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Boolean pagado;

	/** 
	* @return the pagado
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean isPagado() {
		// begin-user-code
		return pagado;
		// end-user-code
	}

	/** 
	* @param pagado the pagado to set
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPagado(Boolean pagado) {
		// begin-user-code
		this.pagado = pagado;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Boolean devuelto;

	/** 
	* @return the devuelto
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean isDevuelto() {
		// begin-user-code
		return devuelto;
		// end-user-code
	}

	/** 
	* @param devuelto the devuelto to set
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setDevuelto(Boolean devuelto) {
		// begin-user-code
		this.devuelto = devuelto;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<TLineaVentas> tLineaVentas;

	/** 
	* @return the tLineaVentas
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<TLineaVentas> gettLineaVentas() {
		// begin-user-code
		return tLineaVentas;
		// end-user-code
	}

	/** 
	* @param tLineaVentas the tLineaVentas to set
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void settLineaVentas(Set<TLineaVentas> tLineaVentas) {
		// begin-user-code
		this.tLineaVentas = tLineaVentas;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private arrayListTProducto cesta;

	/** 
	* @return the cesta
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public arrayListTProducto getCesta() {
		// begin-user-code
		return cesta;
		// end-user-code
	}

	/** 
	* @param cesta the cesta to set
	* @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setCesta(arrayListTProducto cesta) {
		// begin-user-code
		this.cesta = cesta;
		// end-user-code
	}
}