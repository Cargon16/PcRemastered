/**
 * 
 */
package Negocio.Productos;

import java.util.ArrayList;

import Integracion.Productos.TProducto;


public interface SAProducto {
	
	public int create(TProducto producto) ;

	public TProducto read(int id) ;
	
	public ArrayList<TProducto> readAll();

	public int update(TProducto Producto);

	public int delete(int nombre);

	public TProducto readById(int id);



	

	


}