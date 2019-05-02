package Presentacion.Command.Cliente;

import Integracion.Clientes.TCliente;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadClienteCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TCliente i= FactoriaNegocio.getInstance().crearSAClientes().read((int) contexto.getDatos());
		if(i == null){
			contexto.setEvento(Evento.readClienteErrorCommand);
		}
		contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.VentanaCliente, contexto);
		return cnx;

	}

}
