package Presentacion.Command.Proveedores;

import java.util.ArrayList;

import Integracion.Proveedores.TProveedores;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadAllProveedoresCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		ArrayList<TProveedores> i= FactoriaNegocio.getInstance().crearSAProveedores().readAll();
		if(i.isEmpty()){
			contexto.setEvento(Evento.readAllProveedorErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}

}
