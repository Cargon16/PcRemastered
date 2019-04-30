package Presentacion.Command.Proveedores;

import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class DeleteProveedoresCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAProveedores().delete((int) contexto.getDatos());
		if(i == -1){
			contexto.setEvento(Evento.deleteProveedorErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}

}
