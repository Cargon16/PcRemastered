package Presentacion.Command.Ventas;

import Integracion.Ventas.TVentas;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class CreateVentasCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i = FactoriaNegocio.getInstance().crearSAVentas().create((TVentas) contexto.getDatos());
		if ( i == -1 ){
			contexto.setEvento(Evento.createVentasErrorCommand);
			contexto.setDatos(null);
		}
			
		return contexto;
	}

}
