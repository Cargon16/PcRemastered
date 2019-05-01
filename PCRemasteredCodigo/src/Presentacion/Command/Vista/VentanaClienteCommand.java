package Presentacion.Command.Vista;

import Presentacion.VentanaPrincipal;
import Presentacion.Clientes.VentanaClientes;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;

public class VentanaClienteCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		if(contexto.getDatos()==null){
		VentanaClientes.getInstance();
		contexto.setDatos(null);
		
		}
		else{
			VentanaClientes.getInstance().Actualizar(contexto);
			
		}
		return contexto ;
	}

}
