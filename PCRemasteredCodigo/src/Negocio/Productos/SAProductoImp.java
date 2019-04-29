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
		return FactoriaIntegracion.getInstance().crearDaoProducto().update(Producto);
	}

	@Override
	public int delete(int DNI) {
		return FactoriaIntegracion.getInstance().crearDaoProducto().delete(DNI);
	}

	@Override
	public TProducto readByNombre(String Nombre) {
		return FactoriaIntegracion.getInstance().crearDaoProducto().readByNombre(Nombre);
	}
}