/**
 * 
 */
package Negocio.ComprobadorSintactico;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_jcZkgEmIEemqEfCnrOzXGQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_jcZkgEmIEemqEfCnrOzXGQ"
 */
public  abstract class  ComprobadorSintactico {

	public static ComprobadorSintactico instancia;
	
	public static ComprobadorSintactico getInstance(){
		if (instancia==null) instancia = new ComprobadorSintacticoImp();
	return instancia;
	}
	
	
	public abstract  boolean idCorrect(int id);

	public abstract boolean nombreCorrect(String Nombre);

	
	public abstract Boolean DNICorrect(String DNI);

}