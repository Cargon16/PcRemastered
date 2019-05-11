/**
 * 
 */
package Integracion.Ventas;

import java.util.ArrayList;
import java.util.HashMap;

public interface DaoVentas {
	

	public TVentas readbyID(int idVenta);

	public ArrayList<TVentas> readAll();
	
	public int update( TVentas venta);

	int abrirVenta(TVentas venta);
	
	

	public int getCantidadLineaVenta(TLineaVentas lineaVenta);
	
	public int addLineaVenta(TLineaVentas lineaVenta);

	public HashMap<Integer, Integer> getLineaVenta(int idVenta);

	public int updateLineaVenta(TLineaVentas lineaVenta);

	public int eliminarLineaVenta(TLineaVentas venta);


	
}