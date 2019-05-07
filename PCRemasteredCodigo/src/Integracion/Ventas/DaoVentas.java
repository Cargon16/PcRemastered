/**
 * 
 */
package Integracion.Ventas;

import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_kH0tMEAeEemCgsm7gUtwsg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_kH0tMEAeEemCgsm7gUtwsg"
 */
public interface DaoVentas {
	

	public TVentas readbyID(int idVenta);

	public ArrayList<TVentas> readAll();
	
	public int update( TVentas venta);

	public int delete( int idVenta);

	int abrirVenta(TVentas venta);
	
	

	int addLineaVenta(TLineaVentas lineaVenta);
	
}