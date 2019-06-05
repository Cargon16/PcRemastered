package Presentacion.Command.Vista;

import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Ventas.VentanaVentas;

public class VentanaVentasCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		// TODO Auto-generated method stub
		if(contexto.getDatos()==null || contexto.getDatos() instanceof String){
			VentanaVentas.getInstance().setTitle((String) contexto.getDatos());
			contexto.setDatos(null);
			
			}
			else{
				VentanaVentas.getInstance().Actualizar(contexto);
				
				
			}
			return contexto ;
		}
	
}
