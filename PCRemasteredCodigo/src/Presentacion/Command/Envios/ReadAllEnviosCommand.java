package Presentacion.Command.Envios;

import java.util.ArrayList;

import Integracion.Envios.TEnvio;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadAllEnviosCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		ArrayList<TEnvio> i= FactoriaNegocio.getInstance().crearSAEnvios().readAll();
		if(i.isEmpty()){
			contexto.setEvento(Evento.readAllEnvioErrorCommand);
			contexto.setDatos(null);
			return contexto;
		}
		else {
			contexto.setDatos(i);
			Contexto cnx = new Contexto(Evento.crearVentanaEnvios, contexto);
			return cnx;
		}
		
	}

}
