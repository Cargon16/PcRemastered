package Presentacion.Command.Cliente;

import Integracion.Clientes.TCliente;
import Negocio.Clientes.SACliente;
import Negocio.Factorias.FactoriaNegocio;
import Negocio.Factorias.FactoriaNegocioImp;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class CreateClienteCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		
		int i = FactoriaNegocio.getInstance().crearSAClientes().create((TCliente) contexto.getDatos());
		if ( i == -1 ){
			contexto.setEvento(Evento.createClienteErrorCommand);
			contexto.setDatos(null);
		}
			
		return contexto;
		
		
	}

}
