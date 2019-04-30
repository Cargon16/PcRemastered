package Presentacion.Command.Productos;

import Integracion.Productos.TProducto;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class UpdateProductosCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAProductos().update((TProducto) contexto.getDatos());
		if(i == -1){
			contexto.setEvento(Evento.updateProductoErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}

}
