package Presentacion.Command.Proveedores;


import Integracion.Proveedores.TProveedores;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class ReadProveedoresCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TProveedores i= FactoriaNegocio.getInstance().crearSAProveedores().read((int) contexto.getDatos());
		if(i.equals(null)){
			contexto.setEvento(Evento.readProveedorErrorCommand);
			contexto.setDatos(null);
			
		}
		return contexto;
	}

}
