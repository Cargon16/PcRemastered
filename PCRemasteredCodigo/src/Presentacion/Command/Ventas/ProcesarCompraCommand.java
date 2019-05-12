package Presentacion.Command.Ventas;

import java.util.ArrayList;
import java.util.HashMap;

import Integracion.Productos.TProducto;
import Integracion.Ventas.TVentas;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ProcesarCompraCommand implements Command{
	
	public Contexto ejecutar(Contexto contexto) {
	int id = Integer.valueOf(contexto.getDatos().toString());
	//HashMap<Integer, Integer> map  = FactoriaNegocio.getInstance().crearSAVentas().procesarVenta(id);
	TVentas venta = FactoriaNegocio.getInstance().crearSAVentas().read(id);
	//ArrayList<TProducto> p = FactoriaNegocio.getInstance().crearSAProductos().readAll();
	if ( venta == null ){
		contexto.setEvento(Evento.createVentasErrorCommand);
	}
	else
		if(venta.getPrecio() == 0){
			contexto.setEvento(Evento.createVentasErrorCommand);
		}
		else{
			ArrayList<Object> lista = new ArrayList<Object>();
			//lista.add(map);
			lista.add(venta);
			contexto.setDatos(lista);
		}
		Contexto cnx = new Contexto(Evento.crearVentanaPago,contexto);
		return cnx;
	}
	
}
