package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BancoDados {
	
	private static final String url = "jdbc:sqlserver://DESKTOP-GODBMFL; databaseName=javaAula04CRUD";
	private static final String usuario = "sa"; //verificar o seu usuario do banco
	private static final String senha = "W471984wN250299n"; //verificar a sua senha do banco
	private static final String driverBanco = "org.postgresql.Driver";
	private static Connection conexao = null;
	
	//Implementando Singleton
	
	private BancoDados() {
		
	}

	private static void inicializarBanco() throws Exception {
		Class.forName(driverBanco);
		conexao = DriverManager.getConnection(url, usuario, senha);
	
	}
	
	public static Connection getConexao() throws Exception {
		
		if(conexao==null)
			inicializarBanco();
		
		return conexao;
	}
}
