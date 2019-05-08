package Presentacion.Command.Personal;

import Integracion.Personal.TPersonal;
import Integracion.Productos.TProducto;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

public class LoginCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		Contexto cnx;
		// TODO Auto-generated method stub
		int i = FactoriaNegocio.getInstance().crearSAPersonal().login((TPersonal) contexto.getDatos());


		if(i==-1){
			return cnx = new Contexto(Evento.Login, "Datos incorrectos");
		}else{
			return cnx = new Contexto( Evento.INIT,null);
		}


	}

}
