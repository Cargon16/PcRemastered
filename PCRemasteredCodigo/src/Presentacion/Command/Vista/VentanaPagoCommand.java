package Presentacion.Command.Vista;

import Presentacion.Ventas.PanelPago;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;

public class VentanaPagoCommand implements Command {

	@Override
	public Contexto ejecutar(Contexto contexto) {
		// TODO Auto-generated method stub
		if(contexto.getDatos()==null || contexto.getDatos() instanceof String){
			PanelPago.getInstance().setTitle((String) contexto.getDatos());
			contexto.setDatos(null);
			
			}
			else{
				PanelPago.getInstance().Actualizar(contexto);
				
				
			}
			return contexto ;
	}

}
