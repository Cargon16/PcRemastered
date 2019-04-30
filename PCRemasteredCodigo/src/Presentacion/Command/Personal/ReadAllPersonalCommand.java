package Presentacion.Command.Personal;

import java.util.ArrayList;

import Integracion.Envios.TEnvio;
import Integracion.Personal.TPersonal;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadAllPersonalCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		ArrayList<TPersonal> i= FactoriaNegocio.getInstance().crearSAPersonal().readAll();
		if(i.isEmpty()){
			contexto.setEvento(Evento.readAllPersonalErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}
 
}
