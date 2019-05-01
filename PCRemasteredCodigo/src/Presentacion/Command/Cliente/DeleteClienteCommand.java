package Presentacion.Command.Cliente;

import Integracion.Clientes.TCliente;
import Negocio.Clientes.SACliente;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class DeleteClienteCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAClientes().delete(Integer.parseInt((String)contexto.getDatos()));
		if(i < 1){
			contexto.setEvento(Evento.readClienteErrorCommand);
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
