package Presentacion.Command.Vista;

import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Productos.VentanaProducto;

public class VentanaProductosCommand implements Command{
	
	@Override
	public Contexto ejecutar(Contexto contexto) {
		if(contexto.getDatos()==null){
		VentanaProducto.getInstance();
		contexto.setDatos(null);
		
		}
		else{
			VentanaProducto.getInstance().Actualizar(contexto);
			
		}
		return contexto ;
	}

}
