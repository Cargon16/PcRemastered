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
		int r = -1;
		TProducto p = FactoriaIntegracion.getInstance().crearDaoProducto().readByNombre(producto.getNombre());
		if(p==null){
			return FactoriaIntegracion.getInstance().crearDaoProducto().create(producto);
		}
		return r;
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
		return FactoriaIntegracion.getInstance().crearDaoProducto().update(Producto);
	}

	@Override
	public int delete(int id) {
	
			return FactoriaIntegracion.getInstance().crearDaoProducto().delete(id);
	
			
	}

	@Override
	public TProducto readByNombre(String Nombre) {
		return FactoriaIntegracion.getInstance().crearDaoProducto().readByNombre(Nombre);
	}
}