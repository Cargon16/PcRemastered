package Presentacion.Command.Vista;

import Presentacion.Clientes.VentanaClientes;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Login.Login;

public class LoginCommandActualizar implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		if(contexto.getDatos()==null){
			Login.getInstance();
			contexto.setDatos(null);
			
			}
			else{
				Login.getInstance().Actualizar(contexto);
				
			}
			return contexto ;
	}

}
