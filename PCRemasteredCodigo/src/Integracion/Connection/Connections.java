/**
 * 
 */
package Integracion.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Connections {


	public static Connection instance = null;
	
	public static  Connection getInstance() {
		if (instance == null){
			createConnection();
		}
		return instance;
	}

	public static void createConnection() {
		try{
			instance =  DriverManager.getConnection("jdbc:mariadb://localhost/PCRemastered", "root", "1234");
			instance.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}