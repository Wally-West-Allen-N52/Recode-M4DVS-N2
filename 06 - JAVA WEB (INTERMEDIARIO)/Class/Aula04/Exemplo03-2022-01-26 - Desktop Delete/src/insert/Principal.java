package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) { // MAIN É UMA CLASSE EXECUTAVEL. ESTARTA O PROJETO
	
		final String url = "jdbc:sqlserver://DESKTOP-GODBMFL; databaseName=javaAula04CRUD; user=sa; password=W471984wN250299n";
															//   (1),         (2)
		final String instrucao_update = "UPDATE Pessoa SET nome = ? WHERE id = ?"; //  
		
		try {
			
			// CLASSE DE CONEXÂO COM DB
			Connection conexao = DriverManager.getConnection(url); // PARÃMETRO "URL" SETADO, DIZ COM OQUE SE CONECTAR. NO CASO, COM O JDBC:SQLSERVER
			PreparedStatement preparacaoAtrubutosTabelaSQL = conexao.prepareStatement(instrucao_update);
			preparacaoAtrubutosTabelaSQL.setString(1, "Athena");
			preparacaoAtrubutosTabelaSQL.setInt(2, 15);
			
			preparacaoAtrubutosTabelaSQL.executeUpdate();
			
			// APRESENTAÇÃO DE TESTE (NÂO OBRIGATÓRIO)
			System.out.println("Conexão estabelecida com sucesso " + conexao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
