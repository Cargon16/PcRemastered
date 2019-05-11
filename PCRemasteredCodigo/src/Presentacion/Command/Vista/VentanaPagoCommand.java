package Presentacion.Command.Vista;

import Presentacion.Ventas.PanelPago;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;

public class VentanaPagoCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		
		PanelPago.Inicializar(contexto);
			
		return contexto ;
	}

}
