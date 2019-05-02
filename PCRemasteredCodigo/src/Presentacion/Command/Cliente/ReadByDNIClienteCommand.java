package Presentacion.Command.Cliente;

import Integracion.Clientes.TCliente;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadByDNIClienteCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TCliente i= FactoriaNegocio.getInstance().crearSAClientes().readByDNI((String) contexto.getDatos());
		if(i.equals(null)){
			contexto.setEvento(Evento.readByDNIClienteCommandError);
			contexto.setDatos(null);
			return contexto;
		}
		else {
			contexto.setDatos(i);
			Contexto cnx = new Contexto(Evento.VentanaCliente, contexto);
			return cnx;
		}
		
		
	}

}
