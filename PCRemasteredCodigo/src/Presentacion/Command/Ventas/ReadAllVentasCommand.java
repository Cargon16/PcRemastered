package Presentacion.Command.Ventas;

import java.util.ArrayList;
import Integracion.Ventas.TVentas;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadAllVentasCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		ArrayList<TVentas> i= FactoriaNegocio.getInstance().crearSAVentas().readAll();
		if(i==null){
			contexto.setEvento(Evento.readAllVentasErrorCommand);
			
			
		}
		else contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.crearVentanaVentas, contexto);
		return cnx;
	}

}
