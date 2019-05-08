package main;

import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

public class Main {

	public static void main(String[] args) {
		Contexto contexto = new Contexto( Evento.Login,null);
		Controller.getInstance().ejecutar(contexto);
		
	}

}
