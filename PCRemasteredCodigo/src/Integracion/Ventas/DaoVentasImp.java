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
	public int abrirVenta(TVentas venta){
		int retorno = 0;
		String create= "INSERT INTO ventas (precio,fecha,pagado,devuelto,idCliente,IDPersonal) VALUES (?,?,?,?,?,?);" ;
		try{
		Connection conn = Connections.getInstance();
			if ( conn!= null){
				PreparedStatement stmt = conn.prepareStatement(create,Statement.RETURN_GENERATED_KEYS);
				stmt.setFloat(1,venta.getPrecio());
				stmt.setDate(2,venta.getFecha());
				stmt.setBoolean(3, venta.getPagado());
				stmt.setBoolean(4, venta.getDevuelto());
				stmt.setInt(5, venta.getIDCliente());
				stmt.setInt(6, venta.getIDPersonal());
				stmt.execute();
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next())
					retorno=rs.getInt(1);
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
		return null;
		
	}

	@Override
	public ArrayList<TVentas> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(TVentas venta) {
		int retorno = 0;
		String update= "UPDATE ventas SET precio="+venta.getPrecio()+","
				+ "fecha="+venta.getFecha()+","
				+ "pagado="+venta.getFecha()+","
				+ "devuelto="+venta.getFecha()+","
				+ "idcliente="+venta.getFecha()+","
				+ "idpersonal="+venta.getFecha()+""
				+ "WHERE id="+venta.getID()+";";
		try{
		Connection conn = Connections.getInstance();
			if ( conn!= null){
				Statement stmt = conn.createStatement();
				stmt.execute(update);
				retorno = venta.getID();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retorno;
	}

	@Override
	public int delete(int idVenta) {
		// TODO Auto-generated method stub
		return 0;
	}
/*
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
	*/
	/*
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
	}*/
	@Override
	public int añadirLineaVenta(TLineaVentas lineaVenta) {
		String insercion = "INSERT INTO lineaventa (idVenta,idProducto, cantidad) VALUES (?,?,?)";
		try{
			Connection conn = Connections.getInstance();
			if ( conn!= null){
				PreparedStatement stmt = conn.prepareStatement(insercion,Statement.RETURN_GENERATED_KEYS);
				stmt.setInt(1, lineaVenta.getIDVenta());
				stmt.setInt(2, lineaVenta.getIDProducto());
				stmt.setInt(3, lineaVenta.getCantidad());
				stmt.execute();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return lineaVenta.getIDVenta();
	}
	

}
