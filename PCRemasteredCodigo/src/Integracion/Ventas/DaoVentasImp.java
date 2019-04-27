/**
 * 
 */
package Integracion.Ventas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import Integracion.Connection.Connections;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_gQWsYEAeEemCgsm7gUtwsg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_gQWsYEAeEemCgsm7gUtwsg"
 */
public class DaoVentasImp implements DaoVentas {

	@Override
	public int create(TVentas tVenta) {
	
		String insercion = "INSERT INTO ventas (id,precioTotal,fecha,pagado,devuelto,idCliente,activo) VALUES ('" + tVenta.getID() + "', '"
				+ tVenta.getPrecio() + "', '" + tVenta.getFecha() + "', '"+tVenta.getCliente()+"', '" + "');";
		int id = -1;
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				for (TLineaVentas l : tVenta.getLineasVenta().values())
					insertaLineaVenta(l, conn);
				Statement stmt = conn.createStatement();
				stmt.execute(insercion);
				id = tVenta.getID();
					
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			id = -1;
		}
		return id;
	}

	@Override
	public TVentas readbyID(int idVenta) {
		
	}

	@Override
	public ArrayList<TVentas> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(TVentas venta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int idVenta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int añadirLineaVenta(TVentas venta, int IDProducto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarLineaVenta(TVentas venta, int IDProducto) {
		// TODO Auto-generated method stub
		return 0;
	}
	private void insertaLineaVenta(TLineaVentas linea, Connection conexion){
		String insercion = "INSERT INTO lineaVenta (idVenta,idProducto,cantidad, precioTotal) VALUES ('" +
		linea.getIDVenta() + "' , '" + linea.getIDProducto()  +  "' , '" + linea.getCantidad() +  "' , '" + linea.getPrecioTotal() + "');";
		try {
			Statement stmt = conexion.createStatement();
			stmt.execute(insercion);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private HashMap<Integer, TLineaVentas> getLineaVenta(int idVenta,Connection conexion){
		String lectura="SELECT * FROM lineaVenta WHERE idVenta="+idVenta+" FOR UPDATE;";
		HashMap<Integer, TLineaVentas> retorno=new HashMap<Integer, TLineaVentas>();
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(lectura);
			while (rs.next()) {
				int idProducto=rs.getInt("idProducto");
				TLineaVentas lineaventa = new TLineaVentas(rs.getInt("idVenta"),idProducto, rs.getInt("cantidad"),rs.getFloat("precioTotal"));
				retorno.put(idProducto,lineaventa);
			}
		} catch (SQLException e) {
			retorno=null;
		}
		return retorno;
	}
	
}