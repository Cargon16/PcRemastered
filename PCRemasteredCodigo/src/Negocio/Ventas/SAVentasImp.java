/**
 * 
 */
package Negocio.Ventas;

import Integracion.Ventas.TVentas;

import java.util.ArrayList;
import java.util.Set;

import Integracion.Factorias.FactoriaIntegracion;
import Integracion.Productos.TProducto;


public class SAVentasImp implements SAVentas {
	
	public int create(TVentas tVenta) {
		return FactoriaIntegracion.getInstance().crearDaoVenta().create(tVenta);
	}

	public TVentas read(int id) {
		return FactoriaIntegracion.getInstance().crearDaoVenta().readbyID(id);
	}

	public ArrayList<TVentas> readAll() {
		return FactoriaIntegracion.getInstance().crearDaoVenta().readAll();
	}

	public int update(TVentas tVenta) {
		return FactoriaIntegracion.getInstance().crearDaoVenta().update(tVenta);
	}

	public TVentas addCesta(int id, TProducto producto, int cantidad) {
		//return FactoriaIntegracion.getInstance().crearDaoVenta().adirLineaVenta(id,producto);
		return null;
	}

	public TVentas removeCesta(int id, TProducto producto, int cantidad) {
		//return FactoriaIntegracion.getInstance().crearDaoVenta().delete(id);
		return null;
	}

	public int devolucion(int id) {
		//return FactoriaIntegracion.getInstance().crearDaoVenta();
		return 0;
	}

	public int closeVenta(int id) {
		//return FactoriaIntegracion.getInstance().crearDaoVenta().cerrarVenta();
		return 0;
	}
}