/**
 * 
 */
package Negocio.Productos;

import Integracion.Productos.TProducto;

import java.util.ArrayList;
import java.util.Set;


public interface SAProducto {
	
	public int create(TProducto producto) ;

	public TProducto read(int id) ;
	
	public ArrayList<TProducto> readAll();

	public int update(TProducto Producto);

	public int delete(int nombre);

	public TProducto readByNombre(String Nombre);

	


}