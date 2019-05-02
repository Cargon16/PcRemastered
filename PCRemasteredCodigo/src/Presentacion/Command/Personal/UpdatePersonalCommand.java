package Presentacion.Command.Personal;

import Integracion.Personal.TPersonal;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class UpdatePersonalCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAPersonal().update((TPersonal) contexto.getDatos());
		if(i == -1){
			contexto.setEvento(Evento.updatePersonalErrorCommand);
			contexto.setDatos(null);
			return contexto;
		}
		else {
			contexto.setDatos(i);
			Contexto cnx = new Contexto(Evento.crearVentanaPersonal, contexto);
			return cnx;
		}
		
		
	}

}
