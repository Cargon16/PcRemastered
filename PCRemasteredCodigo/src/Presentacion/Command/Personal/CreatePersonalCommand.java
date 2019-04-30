package Presentacion.Command.Personal;

import Integracion.Personal.TPersonal;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class CreatePersonalCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i = FactoriaNegocio.getInstance().crearSAPersonal().create((TPersonal) contexto.getDatos());
		if ( i == -1 ){
			contexto.setEvento(Evento.createPersonalErrorCommand);
			contexto.setDatos(null);
		}
			
		return contexto;
	}

}
