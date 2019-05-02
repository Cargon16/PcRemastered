package Presentacion.Command.Vista;

import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Personal.VentanaPersonal;

public class VentanaPersonalCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		if(contexto.getDatos()==null){
		VentanaPersonal.getInstance();
		contexto.setDatos(null);
		
		}
		else{
			VentanaPersonal.getInstance().Actualizar(contexto);
			
		}
		return contexto ;
	}

}
