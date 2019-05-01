package Presentacion.Command.Vista;

import Presentacion.Envios.VentanaEnvio;
import Presentacion.Command.Contexto;
import Presentacion.Command.Command;

public class VentanaEnvioCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		if(contexto.getDatos()==null){
		VentanaEnvio.getInstance();
		contexto.setDatos(null);
		
		}
		else{
			VentanaEnvio.getInstance().Actualizar(contexto);
			
		}
		return contexto ;
	}

}
