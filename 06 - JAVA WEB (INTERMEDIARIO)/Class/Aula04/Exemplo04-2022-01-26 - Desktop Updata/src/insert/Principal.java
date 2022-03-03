package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) { // MAIN � UMA CLASSE EXECUTAVEL. ESTARTA O PROJETO
	
		final String url = "jdbc:sqlserver://DESKTOP-GODBMFL; databaseName=javaAula04CRUD; user=sa; password=W471984wN250299n";
																	
		final String instrucao_delete = "DELETE FROM Pessoa WHERE id = ?"; // 
		
		try {
			
			// CLASSE DE CONEX�O COM DB
			Connection conexao = DriverManager.getConnection(url); // PAR�METRO "URL" SETADO, DIZ COM OQUE SE CONECTAR. NO CASO, COM O JDBC:SQLSERVER
			PreparedStatement preparacaoAtrubutosTabelaSQL = conexao.prepareStatement(instrucao_delete);
			preparacaoAtrubutosTabelaSQL.setInt(1, 10);
			
			preparacaoAtrubutosTabelaSQL.executeUpdate();
			
			// APRESENTA��O DE TESTE (N�O OBRIGAT�RIO)
			System.out.println("Conex�o estabelecida com sucesso " + conexao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
