package Presentacion.Command.Ventas;

import java.util.ArrayList;

import Integracion.Productos.TProducto;
import Integracion.Ventas.TVentas;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class PagoProductoVentaCommand implements Command{
	@Override
	public Contexto ejecutar(Contexto contexto) {
		ArrayList<Object> lista = new ArrayList<Object>();
		lista = (ArrayList<Object>) contexto.getDatos();
		int i = FactoriaNegocio.getInstance().crearSAVentas().vincularClienteVenta(Integer.valueOf(lista.get(0).toString()), Integer.valueOf(lista.get(1).toString()));
		if ( i != -1){
		TVentas v = FactoriaNegocio.getInstance().crearSAVentas().read(Integer.valueOf(Integer.valueOf(lista.get(0).toString())));
		v.setPagado(true);
		FactoriaNegocio.getInstance().crearSAVentas().update(v);
		//contexto.setDatos(lista);
		}
		Contexto cnx = new Contexto(Evento.crearVentanaVentas,contexto);
		return cnx;
	}
	
}
