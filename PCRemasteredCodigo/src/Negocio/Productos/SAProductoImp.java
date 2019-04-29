/**
 * 
 */
package Negocio.Productos;

import java.util.Set;

import Integracion.Productos.TProducto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_KPvNIEmbEem-LJ9cS2JMbA"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_KPvNIEmbEem-LJ9cS2JMbA"
 */
public class SAProductoImp implements SAProducto  {

	@Override
	public int create(TProducto producto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TProducto read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<TProducto> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(TProducto Producto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int DNI) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TProducto readByNombre(String Nombre) {
		// TODO Auto-generated method stub
		return null;
	}
}