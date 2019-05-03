package Presentacion.Command.Productos;

import java.util.ArrayList;

import Integracion.Productos.TProducto;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadAllProductosCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		ArrayList<TProducto> i= FactoriaNegocio.getInstance().crearSAProductos().readAll();
		if(i==null){
			contexto.setEvento(Evento.readAllProductoErrorCommand);
			
			
		}
		contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.crearVentanaProductos, contexto);
		return cnx;
	}

}
