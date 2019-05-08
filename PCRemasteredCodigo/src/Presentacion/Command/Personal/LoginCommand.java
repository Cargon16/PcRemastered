package Presentacion.Command.Personal;

import Integracion.Personal.TPersonal;
import Integracion.Productos.TProducto;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import Presentacion.Login.Login;

public class LoginCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		
		// TODO Auto-generated method stub
		
		Contexto cnx ;
			 
			 
			 int i = FactoriaNegocio.getInstance().crearSAPersonal().login((TPersonal) contexto.getDatos());
			 if ( i > 0 ){
				 	
					 cnx= new Contexto(Evento.INIT, i);
					 return cnx;
			}
			else contexto.setDatos(i);
			cnx= new Contexto(Evento.Login, contexto);
			return cnx;

		}

	

}
