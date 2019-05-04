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
		
		//Si existe solo se cambiaria el stock
		//Si no existe se crea normal
		
		TProducto t =FactoriaIntegracion.getInstance().crearDaoProducto().readByNombre(producto.getNombre());
		if(t==null){
			return FactoriaIntegracion.getInstance().crearDaoProducto().create(producto);
		}else{
			return -1;
		}
		
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