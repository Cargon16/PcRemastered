package Presentacion.Command.Envios;

import Integracion.Envios.TEnvio;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class UpdateEnviosCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAEnvios().update((TEnvio) contexto.getDatos());
		if(i == -1){
			contexto.setEvento(Evento.updateEnvioErrorCommand);
		}
		else contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.crearVentanaEnvios, contexto);
		return cnx;
		
	}

}
