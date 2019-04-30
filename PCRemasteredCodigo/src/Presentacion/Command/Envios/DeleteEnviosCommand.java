package Presentacion.Command.Envios;

import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class DeleteEnviosCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAEnvios().delete((int) contexto.getDatos());
		if(i == -1){
			contexto.setEvento(Evento.deleteEnvioErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}

}
