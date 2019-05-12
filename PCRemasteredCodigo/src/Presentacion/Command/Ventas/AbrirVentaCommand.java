package Presentacion.Command.Ventas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import Integracion.Productos.TProducto;
import Integracion.Ventas.TVentas;
import Negocio.Factorias.FactoriaNegocio;
import Presentacion.Command.Command;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;

public class AbrirVentaCommand implements Command{

	@Override
	public Contexto ejecutar(Contexto contexto) {
		String  empleado =  (String) contexto.getDatos();
		empleado=empleado.substring(10, 11);
		Date inicioLocal = new Date(Calendar.getInstance().getTimeInMillis());
		TVentas venta = new TVentas(null, 0, inicioLocal,false, null, 1, Integer.valueOf(empleado));// El id es 1 porque es el administrador
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
