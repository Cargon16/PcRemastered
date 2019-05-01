/**
 * 
 */
package Integracion.Clientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.text.StyleContext.SmallAttributeSet;

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

	//////////////// POR REVISAR EL AUTOINCREMENT//////////////
	@Override
	public Integer create( TCliente tCliente ) {
		int id =0;
		String insercion = "INSERT INTO clientes (DNI,Nombre,Direccion,Telefono,Activo) VALUES (?,?,?,?,?)";
			
		Connection conn = Connections.getInstance();
			if (conn != null) {
				try {				
					PreparedStatement stmt = conn.prepareStatement(insercion ,Statement.RETURN_GENERATED_KEYS);
					stmt.setString(1, tCliente.getDNI());
					stmt.setString(2, tCliente.getNombre());
					stmt.setString(3, tCliente.getDireccion());
					stmt.setInt(4, tCliente.getTelefono() );
					stmt.setBoolean(5, tCliente.isActivo());
					stmt.execute();
					stmt.close();
					if (!stmt.isClosed())
						stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		return id ;
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
					retorno = new TCliente(id,rs.getString("dni"), rs.getString("nombre"),rs.getInt("telefono"), 
							rs.getString("direccion"),rs.getBoolean("activo"));
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}
	@Override
	public ArrayList<TCliente> readAll() {
		//String lectura = "SELECT * FROM clientes WHERE activo=1 FOR UPDATE;";
		String lectura = "SELECT * FROM clientes FOR UPDATE;";
		ArrayList<TCliente> retorno = new ArrayList<TCliente>();
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				while (rs.next()) {
					TCliente cliente = new TCliente(rs.getInt("id"),rs.getString("dni"), rs.getString("nombre"),rs.getInt("telefono"), 
							rs.getString("direccion"),rs.getBoolean("activo"));
					retorno.add(cliente);
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}


	@Override
	public int update(TCliente tCliente) {
		int retorno = -1;
		
		int activo = 0;
		if(tCliente.isActivo())
			activo = 1;
		String actualizacion = "UPDATE clientes SET  id='" + tCliente.getID() + "', dni='" + tCliente.getDNI() + 
				"', nombre='" + tCliente.getNombre() + "', telefono='" + tCliente.getTelefono() + "', direccion='" + tCliente.getDireccion() + "', activo='"
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
	@Override
	public TCliente readByDNI(String DNI) {
		String lectura = "SELECT * FROM clientes WHERE dni=" + DNI + " FOR UPDATE;";
		TCliente retorno = null;
		try {
			Connection conn =  Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				if (rs.next()) {
					retorno = new TCliente(rs.getInt("id"),rs.getString("dni"), rs.getString("nombre"),rs.getInt("telefono"), 
							rs.getString("direccion"),rs.getBoolean("activo"));
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

}