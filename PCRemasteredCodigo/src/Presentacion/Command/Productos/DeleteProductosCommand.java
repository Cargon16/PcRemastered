package Presentacion.Command.Productos;

import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class DeleteProductosCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAProductos().delete(Integer.parseInt((String) contexto.getDatos()));
		if(i == -1){
			contexto.setEvento(Evento.readProductoErrorCommand);
		}
		if(i == -2){
			contexto.setEvento(Evento.deleteProductoErrorCommand);
		}
		contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.crearVentanaProductos, contexto);
		return cnx;
	}

}
