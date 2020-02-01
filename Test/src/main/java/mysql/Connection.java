package mysql;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	

	private String driverClassName = "com.mysql.jdbc.Driver";
	private String connectionUrl = "jdbc:mysql://localhost:3306/universidad";
	private String dbUser = "root";
	private String dbPwd = "";



	public Connection getConnection() throws SQLException {
		try {
			Class.forName(driverClassName);
			
			Connection conn = null;
			conn = (Connection) DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
			return conn;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}


	
	
}
