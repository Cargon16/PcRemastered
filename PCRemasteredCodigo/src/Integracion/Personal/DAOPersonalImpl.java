/**
 * 
 */
package Integracion.Personal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Integracion.Connection.Connections;

public class DAOPersonalImpl implements DAOPersonal {

	@Override
	public Integer create(TPersonal personal) {

		int id= 0;
		int activo = 1;

		if (personal.isActivo())
			activo = 1;
		else
			activo = 0;

		String insercion = "INSERT INTO personal " + "VALUES ('" + personal.getPass() +"', '"
				+ personal.isActivo() + "', '" + personal.getSalario() + "', '" + personal.getID() + "', '" + personal.getTelefono() + "', '" +personal.getNombre() +"');";

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

	@Override
	public TPersonal readByID(int id) {
		String lectura = "SELECT * FROM personal WHERE id=" + id + " FOR UPDATE;";
		TPersonal retorno = null;
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				if (rs.next()) {
					retorno = new TPersonal(rs.getString("pass"), rs.getBoolean("activo"), rs.getDouble("salario"),
							rs.getInt("id"),rs.getInt("telefono"), rs.getString("nombre"));
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

	@Override
	public ArrayList<TPersonal> readAll() {
		
		String lectura = "SELECT * FROM personal WHERE activo=1 FOR UPDATE;";
		ArrayList<TPersonal> retorno = new ArrayList<TPersonal>();
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				while (rs.next()) {
					TPersonal personal = new TPersonal(rs.getString("pass"), rs.getBoolean("activo"), rs.getDouble("salario"),
							rs.getInt("id"),rs.getInt("telefono"), rs.getString("nombre"));
					retorno.add(personal);
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

	@Override
	public int update(TPersonal personal) {
		int retorno = -1;
		int activo = 0;
		if(personal.isActivo())
			activo = 1;
		String actualizacion = "UPDATE personal SET  pass='" + personal.getPass() + "', activo='" + personal.isActivo()
				+ "', salario='" + personal.getSalario() + "', id='" + personal.getID() + "', telefono='"
				+ personal.getTelefono()+ "', nombre='" + personal.getNombre() +"' WHERE id=" + personal.getID();
		try {
			Connection conn = Connections.getInstance();

			if (conn != null) {
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(actualizacion);
				retorno = personal.getID();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			retorno = -1;
		}

		return retorno;
	}

	@Override
	public int delete(int id) {
		int retorno = -1;

		String borrado = "UPDATE personal SET activo=0 WHERE id=" + id;
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