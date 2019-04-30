package Presentacion.Command.Proveedores;

import Integracion.Proveedores.TProveedores;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class UpdateProveedoresCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i= FactoriaNegocio.getInstance().crearSAProveedores().update((TProveedores) contexto.getDatos());
		if(i == -1){
			contexto.setEvento(Evento.updateProveedorErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}

}
