/**
 * 
 */
package Integracion.Proveedores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Integracion.Connection.Connections;

public class DaoProveedoresImp implements DaoProveedores {

	public Integer create(TProveedores tProveedor) {
		int id = 0;
		int activo = 1;
		if (tProveedor.isActivo())
			activo = 1;
		else
			activo = 0;
		
		String insercion = "INSERT INTO proveedores " + "VALUES ('" + tProveedor.getDNI() +"', '"
				+ id + "', '" + tProveedor.getNombre() + "', '" + tProveedor.getTelefono() + "', '" + activo + "');";
			
		Connection conn = Connections.getInstance();
			if (conn != null) {
				try {				
					Statement stmt = conn.createStatement();
					stmt.execute(insercion);		
					if (!stmt.isClosed())
						stmt.close();
				} catch (SQLException e) {
					id = -1;
				}
			}
		
	
		return id;
	}

	public TProveedores readByID(int id) {
		
		String lectura = "SELECT * FROM proveedores WHERE id=" + id + " FOR UPDATE;";
		TProveedores retorno = null;
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				if (rs.next()) {
					retorno = new TProveedores(rs.getString("nombre"), rs.getInt("telefono"), rs.getBoolean("activo") ,rs.getString("dni"),id);
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

	
	public ArrayList<TProveedores> readAll() {
		String lectura = "SELECT * FROM proveedores WHERE activo=1 FOR UPDATE;";
		ArrayList<TProveedores> retorno = new ArrayList<TProveedores>();
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				while (rs.next()) {
					TProveedores proveedor = new TProveedores(rs.getString("nombre"), rs.getInt("telefono"), rs.getBoolean("activo") ,rs.getString("dni"),rs.getInt("id"));
					retorno.add(proveedor);
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

	
	public int update(TProveedores tProveedor) {
	
		int retorno = -1;
		int activo = 0;
		if(tProveedor.isActivo())
			activo = 1;
		String actualizacion = "UPDATE proveedores SET  dni='" + tProveedor.getDNI() + "', id='" + tProveedor.getID()
				+ "', nombre='" + tProveedor.getNombre() + "', telefono='" + tProveedor.getTelefono() + "', activo='"
				+ activo + "' WHERE id=" + tProveedor.getID();
		try {
			Connection conn = Connections.getInstance();

			if (conn != null) {
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(actualizacion);
				retorno = tProveedor.getID();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			retorno = -1;
		}

		return retorno;
		
	}

	
	public int delete(int id) {
		int retorno = -1;

		String borrado = "UPDATE proveedores SET activo=0 WHERE id=" + id;
		try {
			Connection conn =  Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(borrado);
				retorno = id;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			retorno = -1;
		}
		return retorno;
		
	}
}