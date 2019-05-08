package Presentacion.Command.Ventas;

import java.util.ArrayList;


import Integracion.Productos.TProducto;
import Integracion.Ventas.TVentas;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class AbrirVentaCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		TVentas venta = new TVentas(null, 0, null,false,null, 1, 1);
		int i = FactoriaNegocio.getInstance().crearSAVentas().create(venta);
		
		ArrayList<TProducto> p = FactoriaNegocio.getInstance().crearSAProductos().readAll();
		ArrayList<Object> lista = new ArrayList<Object>();
		lista.add(i);
		lista.add(p);
		contexto.setDatos(lista);
		Contexto cnx = new Contexto(Evento.crearVentanaVentas,contexto);
		return cnx;
	}

	
}
