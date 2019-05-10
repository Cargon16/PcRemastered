package Presentacion.Command.Personal;

import Integracion.Personal.TPersonal;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadPersonalCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TPersonal i= FactoriaNegocio.getInstance().crearSAPersonal().read((int) contexto.getDatos());
		if(i == null){
			contexto.setEvento(Evento.readPersonalErrorCommand);
		}
		else contexto.setDatos(i);
			Contexto cnx = new Contexto(Evento.crearVentanaPersonal, contexto);
			return cnx;
		
	}

}
