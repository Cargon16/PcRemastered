/**
 * 
 */
package Negocio.Ventas;

import java.util.ArrayList;

import Integracion.Factorias.FactoriaIntegracion;
import Integracion.Productos.TProducto;
import Integracion.Ventas.TLineaVentas;
import Integracion.Ventas.TVentas;


public class SAVentasImp implements SAVentas {
	
	public int create(TVentas tVenta) {
		
		// creo la instancia venta con los datos a null excepto el id 
		//al darle al boton de nueva venta crea la venta null y para pasar a añadir productos,
		
		
		return FactoriaIntegracion.getInstance().crearDaoVenta().abrirVenta(tVenta);
	}
	@Override
	public TVentas AddProductoVenta(int idVenta, int producto, int cantidad){
		TVentas venta = null;
		try{
		venta = FactoriaIntegracion.getInstance().crearDaoVenta().readbyID(idVenta);
		TLineaVentas linea = new TLineaVentas(idVenta, producto, cantidad);
		TProducto p = FactoriaIntegracion.getInstance().crearDaoProducto().read(producto);
		if (p.getStock()>=cantidad){
			FactoriaIntegracion.getInstance().crearDaoVenta().addLineaVenta(linea);
			int nuevoStock = p.getStock()-cantidad;
			p.setStock(nuevoStock);
			FactoriaIntegracion.getInstance().crearDaoProducto().update(p);
			venta = FactoriaIntegracion.getInstance().crearDaoVenta().readbyID(idVenta);
			float nuevoPrecioTotal = venta.getPrecio() + (p.getPrecio() * cantidad);
			venta.setPrecio(nuevoPrecioTotal);
			FactoriaIntegracion.getInstance().crearDaoVenta().update(venta);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return venta;
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