package Presentacion.Command.Envios;

import Integracion.Envios.TEnvio;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadByIDEnviosCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TEnvio i= FactoriaNegocio.getInstance().crearSAEnvios().readByID((int) contexto.getDatos());
		if(i == null){
			contexto.setEvento(Evento.readEnvioErrorCommand);
		}
		else contexto.setDatos(i);
			Contexto cnx = new Contexto(Evento.crearVentanaEnvios, contexto);
			return cnx;
		
	}

}
