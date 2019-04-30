package Presentacion.Command.Vista;

import Presentacion.VentanaPrincipal;
import Presentacion.Clientes.VentanaClientes;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;

public class CrearVentanaClienteCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		VentanaClientes.getInstance();
		return contexto;
	}

}
