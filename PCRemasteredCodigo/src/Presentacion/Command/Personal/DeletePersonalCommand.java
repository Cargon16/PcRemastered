package Presentacion.Command.Personal;

import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class DeletePersonalCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAPersonal().delete((int) contexto.getDatos());
		if(i == -1){
			contexto.setEvento(Evento.deletePersonalErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}

}
