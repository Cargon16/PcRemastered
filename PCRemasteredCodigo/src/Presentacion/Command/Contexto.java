/**
 * 
 */
package Presentacion.Command;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_sfVJUEmjEemGrfQ_CenZZA"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_sfVJUEmjEemGrfQ_CenZZA"
 */
public class Contexto {
	
	private Object datos;
	private Evento evento;
	
	public Contexto(Evento evento, Object datos) {
		
		this.datos = datos;
		this.evento = evento;
	}

	public Object getDatos() {
		// begin-user-code
		return datos;
		// end-user-code
	}

	public void setDatos(Object datos) {
		// begin-user-code
		this.datos = datos;
		// end-user-code
	}

	

	public Evento getEvento() {
		// begin-user-code
		return evento;
		// end-user-code
	}

	/** 
	* @param evento the evento to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_xw37cEmjEemGrfQ_CenZZA?SETTER"
	*/
	public void setEvento(Evento evento) {
		// begin-user-code
		this.evento = evento;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_0gEsoEmjEemGrfQ_CenZZA"
	*/
	
}