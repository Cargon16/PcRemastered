package Presentacion.Command.Ventas;

import Integracion.Ventas.TVentas;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class UpdateVentasCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAVentas().update((TVentas) contexto.getDatos());
		if(i == -1){
			contexto.setEvento(Evento.updateVentasErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}

}
