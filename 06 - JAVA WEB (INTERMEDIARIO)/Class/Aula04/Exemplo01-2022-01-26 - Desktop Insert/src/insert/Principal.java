package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {

	public static void main(String[] args) { // MAIN � UMA CLASSE EXECUTAVEL. ESTARTA O PROJETO
	
		final String url = "jdbc:sqlserver://DESKTOP-GODBMFL; databaseName=javaAula04CRUD; user=sa; password=W471984wN250299n";
																			//(1, 2)
		final String instrucao_insert = "INSERT INTO Pessoa (id, nome) VALUES (?, ?)"; // SETAR PREPAREDSTTATEMENT(?)
		
		try {
			
			// CLASSE DE CONEX�O COM DB
			Connection conexao = DriverManager.getConnection(url); // PAR�METRO "URL" SETADO, DIZ COM OQUE SE CONECTAR. NO CASO, COM O JDBC:SQLSERVER
			
			PreparedStatement preparacaoAtrubutosTabelaSQL = conexao.prepareStatement(instrucao_insert);
			preparacaoAtrubutosTabelaSQL.setInt(1, 15); // "1", PAR�METRO(? = id) A SER USADO.'2'(?) TAMB�M PODERIA SER USADO PRIMEIROO
			preparacaoAtrubutosTabelaSQL.setString(2, "Wallace"); // "2", PAR�METRO(? = NOME)
			preparacaoAtrubutosTabelaSQL.executeUpdate();
			
			// APRESENTA��O DE TESTE (N�O OBRIGAT�RIO)
			System.out.println("Conex�o estabelecida com sucesso " + conexao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
