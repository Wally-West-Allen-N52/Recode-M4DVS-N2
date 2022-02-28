package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	// User name
	private static final String USERNAME = "root";
	
	// MySql password
	private static final String PASSWORD = "12345";
	
	// Path data, base and door of dates to connection
	private static final String DATABASE_ULR = "jdbc:mysql://localhost:3306/crud";
	
	public static Connection createConnectionTomySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_ULR, USERNAME, PASSWORD);
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		Connection con = createConnectionTomySQL();
		
		if(con != null) {
			System.out.println("Conexão obitida com sucesso!" + con);
			con.close();
		}
	}
}
