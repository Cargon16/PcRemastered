package Presentacion.Command.Productos;

import Integracion.Productos.TProducto;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadByNombrePRoductosCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TProducto i= FactoriaNegocio.getInstance().crearSAProductos().readByNombre((String) contexto.getDatos());
		if(i.equals(null)){
			contexto.setEvento(Evento.readByIDProdcutoErrorCommand);
		}
		contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.crearVentanaProductos, contexto);
		return cnx;
	}

}
