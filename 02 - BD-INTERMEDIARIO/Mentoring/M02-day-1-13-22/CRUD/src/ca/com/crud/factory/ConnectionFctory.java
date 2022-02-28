package ca.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFctory {
	public static Connection createConnectionSQLServer() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // For JVM to load the class

		// Two connections with DB

//		Connection connection = DriverManager.getConnection(
//				// Connection with user and password
//				"jdbc:sqlserver://DESKTOP-GODBMFL; databaseName=CrudDB; integratedSecurity=true;");
		Connection connection = DriverManager.getConnection(
				// Connection with user and password
				"jdbc:sqlserver://DESKTOP-GODBMFL; databaseName=CrudDB; user=sa; password=W471984wN250299n"
				);
		return connection;

	}

	public static void main(String[] args) throws Exception {
		// Recover connection with DB
		Connection conn = createConnectionSQLServer();

		// Test if connection in null
		if (conn != null) {
			System.out.println("Connection created " + conn);
			conn.close();
		}
	}
}
