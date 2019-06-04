package Presentacion.Command.Ventas;


import Integracion.Ventas.TVentas;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadVentasCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TVentas i= FactoriaNegocio.getInstance().crearSAVentas().read(Integer.valueOf(contexto.getDatos().toString()));
		if(i==null){
			contexto.setEvento(Evento.readVentasErrorCommand);
			
			
		}
		else contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.crearVentanaVentas, contexto);
		return cnx;
	}

}
