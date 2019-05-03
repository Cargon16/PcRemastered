package Presentacion.Command.Productos;

import Integracion.Productos.TProducto;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadProductosCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TProducto i= FactoriaNegocio.getInstance().crearSAProductos().read((int) contexto.getDatos());
		if(i==null){
			contexto.setEvento(Evento.readProveedorErrorCommand);
			
			
		}
		contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.crearVentanaProductos, contexto);
		return cnx;
	}

}
