/**
 * 
 */
package Negocio.Productos;

import java.util.ArrayList;
import java.util.Set;

import Integracion.Factorias.FactoriaIntegracion;
import Integracion.Productos.TProducto;

public class SAProductoImp implements SAProducto  {

	@Override
	public int create(TProducto producto) {
		
		//Comprobar mediante readByNombre(hacer metodo) si el producto a añadir ya existe 
		//Si existe solo se cambiaria el stock
		//Si no existe se crea normal
		
		
		return FactoriaIntegracion.getInstance().crearDaoProducto().create(producto);
	}

	@Override
	public TProducto read(int id) {
		return FactoriaIntegracion.getInstance().crearDaoProducto().read(id);
	}

	@Override
	public ArrayList<TProducto> readAll() {
		return FactoriaIntegracion.getInstance().crearDaoProducto().readAll();
	}

	@Override
	public int update(TProducto Producto) {
		//Comprobar que el producto existe mediante su ID
		
		return FactoriaIntegracion.getInstance().crearDaoProducto().update(Producto);
	}

	@Override
	public int delete(int id) {
	//Comprobar que el ID existe
			return FactoriaIntegracion.getInstance().crearDaoProducto().delete(id);	
	}
	
	@Override
	public TProducto readById(int id) {
		return FactoriaIntegracion.getInstance().crearDaoProducto().readByID(id);
	}
}