package Presentacion.Command.Personal;

import Integracion.Envios.TEnvio;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadByIDPersonalCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TEnvio i= FactoriaNegocio.getInstance().crearSAEnvios().readByID((int) contexto.getDatos());
		if(i.equals(null)){
			contexto.setEvento(Evento.readByIDPersonalErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}

}
