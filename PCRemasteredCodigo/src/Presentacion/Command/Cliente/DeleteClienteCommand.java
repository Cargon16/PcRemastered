package Presentacion.Command.Cliente;

import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class DeleteClienteCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAClientes().delete((int) contexto.getDatos());
		if(i == -1){
			contexto.setEvento(Evento.deleteClienteErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}

}
