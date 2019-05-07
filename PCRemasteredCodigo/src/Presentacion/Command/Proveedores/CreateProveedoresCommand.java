package Presentacion.Command.Proveedores;

import Integracion.Proveedores.TProveedores;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class CreateProveedoresCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		int i = FactoriaNegocio.getInstance().crearSAProveedores().create((TProveedores) contexto.getDatos());
		if ( i == -1 ){
			contexto.setEvento(Evento.createProveedorErrorCommand);
			contexto.setDatos(null);
		}
			
		return contexto;
	}

}
