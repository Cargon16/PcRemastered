package Presentacion.Command.Ventas;

import java.util.ArrayList;

import Integracion.Ventas.TVentas;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class VincularClienteVentaCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		ArrayList<Object> lista = new ArrayList<Object>();
		lista = (ArrayList<Object>) contexto.getDatos();
		int i = FactoriaNegocio.getInstance().crearSAVentas().vincularClienteVenta(Integer.valueOf(lista.get(0).toString()), Integer.valueOf(lista.get(1).toString()));
		if ( i == -1){
				contexto.setEvento(Evento.addProductoVentaError);
		}
		else contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.crearVentanaPago,contexto);
		return cnx;
	}

}
