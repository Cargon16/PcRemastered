/**
 * 
 */
package Integracion.Envios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Integracion.Connection.Connections;


public class DAOEnvioImpl implements DAOEnvio {
	
	@Override
	public Integer create(TEnvio envio) {
		int id= 0;
		
		int activo = 1;
		if (envio.isEstado())
			activo = 1;
		else
			activo = 0;
		
		String insercion = "INSERT INTO envios " + "VALUES ('" + envio.getID() +"', '"
				+ id + "', '" + envio.isEstado() + "', '" + envio.getDireccion()  + "');";
			
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

	public TEnvio readByID(int id) {
		
		String lectura = "SELECT * FROM envios WHERE id=" + id + " FOR UPDATE;";
		TEnvio retorno = null;
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				if (rs.next()) {
					retorno = new TEnvio(id, rs.getBoolean("estado"), rs.getString("direccion"));
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

	public ArrayList<TEnvio> readAll() {
		String lectura = "SELECT * FROM envios WHERE estado=1 FOR UPDATE;";
		ArrayList<TEnvio> retorno = new ArrayList<TEnvio>();
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				while (rs.next()) {
					TEnvio cliente = new TEnvio(rs.getInt("id"), rs.getBoolean("estado"), rs.getString("direccion"));
					retorno.add(cliente);
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

	public int update(TEnvio envio) {
		int retorno = -1;
		int activo = 0;
		if(envio.isEstado())
			activo = 1;
		String actualizacion = "UPDATE envios SET  id='" + envio.getID()+ "', estado='" + envio.isEstado()
				+ "', direccion='" + envio.getDireccion() + "' WHERE id=" + envio.getID();
		try {
			Connection conn = Connections.getInstance();

			if (conn != null) {
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(actualizacion);
				retorno = envio.getID();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			retorno = -1;
		}

		return retorno;
	}

	public int delete(int id) {
		int retorno = -1;

		String borrado = "UPDATE envios SET activo=0 WHERE id=" + id;
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