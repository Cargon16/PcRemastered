/**
 * 
 */
package Integracion.Ventas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import Integracion.Connection.Connections;
import Integracion.Productos.TProducto;

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
	public int abrirVenta(TVentas venta){
		int retorno = 0;
		String create= "INSERT INTO ventas (precio,fecha,pagado,idCliente,IDPersonal) VALUES (?,?,?,?,?);" ;
		//String create= "INSERT INTO ventas (precio,fecha,pagado,IDPersonal) VALUES (?,?,?,?);" ;
		try{
		Connection conn = Connections.getInstance();
			if ( conn!= null){
				PreparedStatement stmt = conn.prepareStatement(create,Statement.RETURN_GENERATED_KEYS);
				stmt.setFloat(1,venta.getPrecio());
				stmt.setDate(2,venta.getFecha());
				stmt.setBoolean(3, venta.getPagado());
				stmt.setInt(4, venta.getIDCliente());
				stmt.setInt(5, venta.getIDPersonal());
				stmt.execute();
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next())
					retorno=rs.getInt(1);
				stmt.close();
				if (!stmt.isClosed())
					stmt.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retorno;
	}
	/*
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
*/
	@Override
	public TVentas readbyID(int idVenta) {
		String lectura = "SELECT * FROM ventas WHERE id=" +idVenta+ " FOR UPDATE;";
		TVentas retorno = null;
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				HashMap<Integer, Integer> lineasVenta=getLineaVenta(idVenta);
				if (rs.next()) {
					retorno = new TVentas(idVenta,rs.getFloat("precio"),rs.getDate("fecha"), rs.getBoolean("pagado"),lineasVenta,rs.getInt("idcliente"),rs.getInt("idpersonal"));
				}
				stmt.close();
				if (!stmt.isClosed())
					stmt.close();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			retorno = null;
		}
		return retorno;
		
		
		
	}

	@Override
	public ArrayList<TVentas> readAll() {
		String lectura = "SELECT * FROM ventas FOR UPDATE;";
		ArrayList<TVentas> retorno = new ArrayList<TVentas>();
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				while (rs.next()) {
					TVentas venta = new TVentas(rs.getInt("id"),rs.getFloat("precio"),rs.getDate("fecha"), rs.getBoolean("pagado"),getLineaVenta(rs.getInt("id")),rs.getInt("idcliente"),rs.getInt("idpersonal"));
					retorno.add(venta);
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

	@Override
	public int update(TVentas venta) {
		int retorno = 0;
		
		String update= "UPDATE ventas SET precio="+venta.getPrecio()+","
				+ "fecha= '"+venta.getFecha()+"',"
				+ "pagado="+venta.getPagado()+","
				+ "idcliente="+venta.getIDCliente()+","
				+ "idpersonal="+venta.getIDPersonal()+""
				+ " WHERE id="+venta.getID()+";";
		try{
			Connection conn = Connections.getInstance();
			if ( conn!= null){
				Statement stmt = conn.createStatement();
				stmt.execute(update);
				retorno = venta.getID();
				stmt.close();
				if (!stmt.isClosed())
					stmt.close();
			}


		} catch (SQLException e) {
			e.printStackTrace();
			//return -1;
		}
		return retorno;
	}
	
	public int getCantidadLineaVenta(TLineaVentas lineaVenta){
		int cantidad=0;
		String insercion = "SELECT * FROM lineaventa WHERE IdVenta="+ lineaVenta.getIDVenta()+" and idProducto="+lineaVenta.getIDProducto()+";";
		try{
			Connection conn = Connections.getInstance();
			if ( conn!= null){
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(insercion);
				while ( rs.next()){
					cantidad = rs.getInt(3);
				}
				stmt.close();
				if (!stmt.isClosed())
					stmt.close();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return  cantidad;
	}

	@Override
	public HashMap<Integer,Integer> getLineaVenta(int idVenta){
		
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			String insercion = "SELECT * FROM lineaventa WHERE IdVenta="+ idVenta+";";
			try{
				Connection conn = Connections.getInstance();
				if ( conn!= null){
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(insercion);
					while ( rs.next()){
						map.put(rs.getInt(2),rs.getInt(3));
					}
					stmt.close();
					if (!stmt.isClosed())
						stmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			return  map;
	}
	@Override
	public int updateLineaVenta(TLineaVentas lineaVenta){
		String insercion = "UPDATE lineaventa Set cantidad="+lineaVenta.getCantidad()+" Where idVenta="
				+lineaVenta.getIDVenta()+" AND idProducto="+lineaVenta.getIDProducto()+";";
		
				
		try{
			Connection conn = Connections.getInstance();
			if ( conn!= null){
				Statement stmt = conn.createStatement();
				stmt.execute(insercion);
				stmt.close();
				if (!stmt.isClosed())
					stmt.close();
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return lineaVenta.getIDVenta();
	
	}
	@Override
	public int eliminarLineaVenta(TLineaVentas venta){ 
		int retorno = 0;// devuelve la cantidad eliminada de producto X
		String insercion = "Delete from lineaventa Where idVenta="+venta.getIDVenta()+" and idProducto="+venta.getIDProducto()+";";;
		try{
			Connection conn = Connections.getInstance();
			if ( conn!= null){
				Statement stmt = conn.createStatement();
				stmt.executeQuery(insercion);
				stmt.close();
				retorno= venta.getCantidad();
				if (!stmt.isClosed())
					stmt.close();
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return retorno ;
	}
	@Override
	public int addLineaVenta(TLineaVentas lineaVenta) {
		String insercion = "INSERT INTO lineaventa (idVenta,idProducto, cantidad) VALUES (?,?,?)";
		try{
			Connection conn = Connections.getInstance();
			if ( conn!= null){
				PreparedStatement stmt = conn.prepareStatement(insercion,Statement.RETURN_GENERATED_KEYS);
				stmt.setInt(1, lineaVenta.getIDVenta());
				stmt.setInt(2, lineaVenta.getIDProducto());
				stmt.setInt(3, lineaVenta.getCantidad());
				stmt.execute();
				stmt.close();
				if (!stmt.isClosed())
					stmt.close();
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return lineaVenta.getIDVenta();
	}
	
	
	

}
