/**
 * 
 */
package Negocio.Ventas;

import java.util.ArrayList;
import java.util.HashMap;

import Integracion.Productos.TProducto;
import Integracion.Ventas.TVentas;


public interface SAVentas {

	public int create(TVentas tVenta);


	public TVentas read(int id);


	public ArrayList<TVentas> readAll();


	public int update(TVentas tVenta);


	public TVentas addCesta(int id, TProducto producto, int cantidad);


	public TVentas removeCesta(int id, TProducto producto, int cantidad);



	public TVentas AddProductoVenta(int idVenta, int producto, int cantidad);

	public TVentas DeleteProductoVenta(int idVenta, int producto, int cantidad);
	
	public int vincularClienteVenta(int idCliente, int idVenta);
}