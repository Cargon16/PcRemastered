package Presentacion.Command.Productos;

import Integracion.Productos.TProducto;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadByIdProductosCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TProducto i= FactoriaNegocio.getInstance().crearSAProductos().readById((int) contexto.getDatos());
		if(i==null){
			contexto.setEvento(Evento.readByIDProdcutoErrorCommand);
		}
		contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.crearVentanaProductos, contexto);
		return cnx;
	}

}
