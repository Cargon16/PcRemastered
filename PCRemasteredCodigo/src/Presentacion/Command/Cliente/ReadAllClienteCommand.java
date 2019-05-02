package Presentacion.Command.Cliente;

import java.util.ArrayList;

import Integracion.Clientes.TCliente;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadAllClienteCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		ArrayList<TCliente> i = FactoriaNegocio.getInstance().crearSAClientes().readAll();
		if(i==null){
			contexto.setEvento(Evento.readAllClienteErrorCommand);
		}
		contexto.setDatos(i);
		Contexto cnx = new Contexto(Evento.VentanaCliente, contexto);
		return cnx;

		
	}

}
