package Presentacion.Command.Ventas;

import Integracion.Ventas.TVentas;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadVentasCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TVentas i= FactoriaNegocio.getInstance().crearSAVentas().read((int) contexto.getDatos());
		if(i.equals(null)){
			contexto.setEvento(Evento.readVentasErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}

}
