/**
 * 
 */
package Negocio.Productos;

import java.util.ArrayList;

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
		TProducto t=FactoriaIntegracion.getInstance().crearDaoProducto().readByNombre(Producto.getNombre());
		if(t==null){
			return FactoriaIntegracion.getInstance().crearDaoProducto().update(Producto);
			
		}else return -1;
			
		
		
	}

	@Override
	public int delete(int id) {
	TProducto t=FactoriaIntegracion.getInstance().crearDaoProducto().readByID(id);
	if(t!=null){
		if(t.getStock() == 0) return -2;
		return FactoriaIntegracion.getInstance().crearDaoProducto().delete(id);	
	}
	else return -1;
			
	}
	
	@Override
	public TProducto readById(int id) {
		return FactoriaIntegracion.getInstance().crearDaoProducto().readByID(id);
	}

}