/**
 * 
 */
package Negocio.Ventas;

import java.util.ArrayList;
import java.util.HashMap;

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
		TLineaVentas linea = new TLineaVentas(idVenta, producto, cantidad);
		venta = FactoriaIntegracion.getInstance().crearDaoVenta().readbyID(idVenta);
		HashMap<Integer,Integer> map =FactoriaIntegracion.getInstance().crearDaoVenta().getLineaVenta(idVenta);
		TProducto p = FactoriaIntegracion.getInstance().crearDaoProducto().read(producto);
		if (p.getStock()>=cantidad){

			
			 // encuentra linea de venta con idVenta
				if(map.containsKey(producto)){
					// si encuentra producto existe con lina de venta
					//y actualiza solo la cantidad de ese producto
					linea.setCantidad(map.get(producto)+ cantidad);
					FactoriaIntegracion.getInstance().crearDaoVenta().updateLineaVenta(linea);
					map.replace(producto, map.get(producto)+ cantidad);
				}
		
			else{
				FactoriaIntegracion.getInstance().crearDaoVenta().addLineaVenta(linea);
				map.put(producto, cantidad);
			}

		
				
			int nuevoStock = p.getStock()-cantidad;
			p.setStock(nuevoStock);
			FactoriaIntegracion.getInstance().crearDaoProducto().update(p);
			venta.setLineasVenta(map);
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
	@Override
	public TVentas DeleteProductoVenta(int idVenta, int producto, int cant){
		TLineaVentas linea = new TLineaVentas(idVenta, producto, 0);
		TVentas ventas = FactoriaIntegracion.getInstance().crearDaoVenta().readbyID(idVenta);
		int cantidad = FactoriaIntegracion.getInstance().crearDaoVenta().getCantidadLineaVenta(linea);
		FactoriaIntegracion.getInstance().crearDaoVenta().eliminarLineaVenta(linea);
		
		if( cantidad > 0 && cantidad >= cant){ // si es mayor que cero significa que es si exsite la linea de venta y que se puede eliminar
			
			HashMap<Integer, Integer> lineaVenta = ventas.getLineasVenta();
			lineaVenta.remove(producto);
			ventas.setLineasVenta(lineaVenta);
			//actualizamos el producto para devolverle el stock
			TProducto p = FactoriaIntegracion.getInstance().crearDaoProducto().readByID(producto); 
			p.setStock(p.getStock()+cant);
			FactoriaIntegracion.getInstance().crearDaoProducto().update(p);			
			ventas.setPrecio( ventas.getPrecio() - (p.getPrecio() * cant ));
			FactoriaIntegracion.getInstance().crearDaoVenta().update(ventas);
		}
		return ventas;
		
		
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
	public HashMap<Integer, Integer> procesarVenta(int id) {
		HashMap<Integer, Integer> map = FactoriaIntegracion.getInstance().crearDaoVenta().getLineaVenta(id);
		return map;
	}

	public int closeVenta(int id) {
		//return FactoriaIntegracion.getInstance().crearDaoVenta().cerrarVenta();
		return 0;
	}
}