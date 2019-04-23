/**
 * 
 */
package Integracion.Ventas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Set;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zVHWwEAeEemCgsm7gUtwsg"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zVHWwEAeEemCgsm7gUtwsg"
*/
public class TVentas {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_0dTt4EAeEemCgsm7gUtwsg"
	*/
	private Integer ID;

	/** 
	* @return the ID
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_0dTt4EAeEemCgsm7gUtwsg?GETTER"
	*/
	public Integer getID() {
		// begin-user-code
		return ID;
		// end-user-code
	}

	/** 
	* @param ID the ID to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_0dTt4EAeEemCgsm7gUtwsg?SETTER"
	*/
	public void setID(Integer ID) {
		// begin-user-code
		this.ID = ID;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_0zTMAEAeEemCgsm7gUtwsg"
	*/
	private float precio;

	/** 
	* @return the precio
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_0zTMAEAeEemCgsm7gUtwsg?GETTER"
	*/
	public float getPrecio() {
		// begin-user-code
		return precio;
		// end-user-code
	}

	/** 
	* @param precio the precio to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_0zTMAEAeEemCgsm7gUtwsg?SETTER"
	*/
	public void setPrecio(float precio) {
		// begin-user-code
		this.precio = precio;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_1i414EAeEemCgsm7gUtwsg"
	*/
	private Date fecha;

	/** 
	* @return the fecha
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_1i414EAeEemCgsm7gUtwsg?GETTER"
	*/
	public Date getFecha() {
		// begin-user-code
		return fecha;
		// end-user-code
	}

	/** 
	* @param fecha the fecha to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_1i414EAeEemCgsm7gUtwsg?SETTER"
	*/
	public void setFecha(Date fecha) {
		// begin-user-code
		this.fecha = fecha;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_1xaaEEAeEemCgsm7gUtwsg"
	*/
	private Boolean pagado;

	/** 
	* @return the pagado
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_1xaaEEAeEemCgsm7gUtwsg?GETTER"
	*/
	public Boolean isPagado() {
		// begin-user-code
		return pagado;
		// end-user-code
	}

	/** 
	* @param pagado the pagado to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_1xaaEEAeEemCgsm7gUtwsg?SETTER"
	*/
	public void setPagado(Boolean pagado) {
		// begin-user-code
		this.pagado = pagado;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_k991kEAfEemCgsm7gUtwsg"
	*/
	private Boolean devuelto;

	/** 
	* @return the devuelto
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_k991kEAfEemCgsm7gUtwsg?GETTER"
	*/
	public Boolean isDevuelto() {
		// begin-user-code
		return devuelto;
		// end-user-code
	}

	/** 
	* @param devuelto the devuelto to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_k991kEAfEemCgsm7gUtwsg?SETTER"
	*/
	public void setDevuelto(Boolean devuelto) {
		// begin-user-code
		this.devuelto = devuelto;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_I_rJQUAgEemCgsm7gUtwsg"
	*/
	private Set<TLineaVentas> tLineaVentas;

	/** 
	* @return the tLineaVentas
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_I_rJQUAgEemCgsm7gUtwsg?GETTER"
	*/
	public Set<TLineaVentas> gettLineaVentas() {
		// begin-user-code
		return tLineaVentas;
		// end-user-code
	}

	/** 
	* @param tLineaVentas the tLineaVentas to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_I_rJQUAgEemCgsm7gUtwsg?SETTER"
	*/
	public void settLineaVentas(Set<TLineaVentas> tLineaVentas) {
		// begin-user-code
		this.tLineaVentas = tLineaVentas;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_3_nsIEAgEemCgsm7gUtwsg"
	*/
	private ArrayList cesta;

	/** 
	* @return the cesta
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_3_nsIEAgEemCgsm7gUtwsg?GETTER"
	*/
	public ArrayList getCesta() {
		// begin-user-code
		return cesta;
		// end-user-code
	}

	/** 
	* @param cesta the cesta to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_3_nsIEAgEemCgsm7gUtwsg?SETTER"
	*/
	public void setCesta(ArrayList cesta) {
		// begin-user-code
		this.cesta = cesta;
		// end-user-code
	}
}