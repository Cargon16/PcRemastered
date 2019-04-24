/**
 * 
 */
package Integracion.Clientes;

import java.sql.Connection;
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
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_HwuYED6aEemCgsm7gUtwsg"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_HwuYED6aEemCgsm7gUtwsg"
*/
public class DAOClienteImpl implements DAOCliente {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_3fJYQz6fEemCgsm7gUtwsg"
	*/
	//////////////// POR REVISAR EL AUTOINCREMENT//////////////
	@Override
	public Integer create( TCliente tCliente ) {
		int id= 0;
		int activo = 1;
		if (tCliente.isActivo())
			activo = 1;
		else
			activo = 0;
		
		String insercion = "INSERT INTO clientes " + "VALUES ('" + tCliente.getDNI() +"', '"
				+ id + "', '" + tCliente.getNombre() + "', '" + tCliente.getTelefono() + "', '" + activo + "');";
			
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
//////////////////////////////////////////////////////////
	@Override
	public TCliente readByID( int id) {
		String lectura = "SELECT * FROM clientes WHERE id=" + id + " FOR UPDATE;";
		TCliente retorno = null;
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				if (rs.next()) {
					retorno = new TCliente(id, rs.getInt("telefono"), rs.getString("nombre"),
							rs.getString("direccion"),rs.getString("dni"), rs.getBoolean("activo"));
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}
	@Override
	public ArrayList<TCliente> readAll() {
		String lectura = "SELECT * FROM clientes WHERE activo=1 FOR UPDATE;";
		ArrayList<TCliente> retorno = new ArrayList<TCliente>();
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				while (rs.next()) {
					TCliente cliente = new TCliente(rs.getInt("id"), rs.getInt("telefono"), rs.getString("nombre"),
							rs.getString("direccion"),rs.getString("dni"), rs.getBoolean("activo"));
					retorno.add(cliente);
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_3fJYTD6fEemCgsm7gUtwsg"
	*/
	@Override
	public int update(TCliente tCliente) {
		int retorno = -1;
		int activo = 0;
		if(tCliente.isActivo())
			activo = 1;
		String actualizacion = "UPDATE clientes SET  dni='" + tCliente.getDNI() + "', id='" + tCliente.getID()
				+ "', nombre='" + tCliente.getNombre() + "', telefono='" + tCliente.getTelefono() + "', activo='"
				+ activo + "' WHERE id=" + tCliente.getID();
		try {
			Connection conn = Connections.getInstance();

			if (conn != null) {
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(actualizacion);
				retorno = tCliente.getID();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			retorno = -1;
		}

		return retorno;
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_3fSiMD6fEemCgsm7gUtwsg"
	*/
	@Override
	public int delete(int id) {
		int retorno = -1;

		String borrado = "UPDATE clientes SET activo=0 WHERE id=" + id;
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