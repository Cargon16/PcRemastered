/**
 * 
 */
package Integracion.Productos;

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
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_byBcsEAaEemCgsm7gUtwsg"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_byBcsEAaEemCgsm7gUtwsg"
 */
public class DaoProductoImp implements DaoProducto {
	
	public Integer create(TProducto tProducto) {
		int id= 0;
		String insercion = "INSERT INTO productos (Nombre,Descripcion,Stock,Precio) VALUES (?,?,?,?)";
			
		Connection conn = Connections.getInstance();
			if (conn != null) {
				try {				
					PreparedStatement stmt = conn.prepareStatement(insercion, Statement.RETURN_GENERATED_KEYS);
					stmt.setString(1, tProducto.getNombre());
					stmt.setString(2, tProducto.getDescripcion());
					stmt.setInt(3, tProducto.getStock());
					stmt.setFloat(4, tProducto.getPrecio());
					stmt.execute();
					ResultSet rs = stmt.getGeneratedKeys();
					if(rs.next())
						id=rs.getInt(1);
					stmt.close();
					if(!stmt.isClosed())
						stmt.close();
				}catch(SQLException e){}
			}
		return id;
	}

	public TProducto read(int id) {
		String lectura = "SELECT * FROM productos WHERE id=" + id + " FOR UPDATE;";
		TProducto retorno = null;
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				if (rs.next()) {
					retorno = new TProducto(id, rs.getString("nombre"), rs.getString("descripcion"),
							rs.getInt("stock"),rs.getFloat("precio"));
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

	public ArrayList<TProducto> readAll() {
		String lectura = "SELECT * FROM productos WHERE stock > 0 FOR UPDATE;";
		ArrayList<TProducto> retorno = new ArrayList<TProducto>();
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				while (rs.next()) {
					TProducto producto = new TProducto(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"),
							rs.getInt("stock"),rs.getInt("precio"));
					retorno.add(producto);
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

	public int delete(int id) {
		int retorno = -1;

		String borrado = "UPDATE productos SET stock=0 WHERE id=" + id;
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

	public int update(TProducto tProducto) {
		int retorno = -1;
		
		String actualizacion = "UPDATE productos SET  id='" + tProducto.getId()
				+ "', nombre='" + tProducto.getNombre() + "', descripcion='" + tProducto.getDescripcion() + "', stock='"
				+ tProducto.getStock() + "', precio='" + tProducto.getPrecio() + "' WHERE id=" + tProducto.getId();
		try {
			Connection conn = Connections.getInstance();

			if (conn != null) {
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(actualizacion);
				retorno = tProducto.getId();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			retorno = -1;
		}

		return retorno;
	}

	@Override
	public TProducto readByID(int id) {
		String lectura = "SELECT * FROM productos WHERE id=" + id + " FOR UPDATE;";
		TProducto retorno = null;
		try {
			Connection conn = Connections.getInstance();
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(lectura);
				if (rs.next()) {
					retorno = new TProducto(id, rs.getString("nombre"), rs.getString("descripcion"),
							rs.getInt("stock"),rs.getFloat("precio"));
				}
			}
		} catch (SQLException e) {
			retorno = null;
		}
		return retorno;
	}

}