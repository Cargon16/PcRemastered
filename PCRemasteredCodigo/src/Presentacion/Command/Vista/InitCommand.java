package Presentacion.Command.Vista;

import Presentacion.VentanaPrincipal;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;

public class InitCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		// TODO Auto-generated method stub
		VentanaPrincipal.getInstance();
		contexto.setDatos(null);
		return contexto ;
	}

}
