package Presentacion.Command.Envios;


import Integracion.Envios.TEnvio;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class CreateEnviosCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		
		int i = FactoriaNegocio.getInstance().crearSAEnvios().create((TEnvio) contexto.getDatos());
		if ( i == -1 ){
			contexto.setEvento(Evento.createEnvioErrorCommand);
			contexto.setDatos(null);
		}
			
		return contexto;
	}
	
	

}
