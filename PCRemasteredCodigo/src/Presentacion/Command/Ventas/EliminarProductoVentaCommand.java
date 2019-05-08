package Presentacion.Command.Ventas;

import java.util.ArrayList;

import Integracion.Ventas.TVentas;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class EliminarProductoVentaCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		ArrayList<Object> lista = (ArrayList<Object>) contexto.getDatos();
		TVentas i = FactoriaNegocio.getInstance().crearSAVentas().DeleteProductoVenta((int)lista.get(0), (int)lista.get(1));
		if ( i == null){
				contexto.setEvento(Evento.AñadirProductoVentaError);
		}
		else contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.crearVentanaVentas,contexto);
		return cnx;
	}

}
