package Presentacion.Command.Productos;

import Integracion.Personal.TPersonal;
import Integracion.Productos.TProducto;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class CreateProductosCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i = FactoriaNegocio.getInstance().crearSAProductos().create((TProducto) contexto.getDatos());
		if ( i == -1 ){
			contexto.setEvento(Evento.createProductoErrorCommand);
			contexto.setDatos(null);
			return contexto;
		}else{
			contexto.setDatos(i);
			Contexto cnx = new Contexto(Evento.crearVentanaProductos,contexto);
			return cnx;
			
		}
		
	}

}
