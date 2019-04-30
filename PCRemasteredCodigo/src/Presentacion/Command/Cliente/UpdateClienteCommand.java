package Presentacion.Command.Cliente;

import Integracion.Clientes.TCliente;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class UpdateClienteCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAClientes().update((TCliente) contexto.getDatos());
		if(i == -1){
			contexto.setEvento(Evento.updateClienteErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
		
	}

}
