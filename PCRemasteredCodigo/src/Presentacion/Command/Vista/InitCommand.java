package Presentacion.Command.Vista;

import Presentacion.VentanaPrincipal;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;

public class InitCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		// TODO Auto-generated method stub
		
		if(contexto.getDatos()==null)
			VentanaPrincipal.getInstance();
		else {
			Integer i = (int) contexto.getDatos();
			VentanaPrincipal.getInstance().setTitle("Nº de empleado: "+i.toString());
		}
		
		return contexto ;
	}

}
