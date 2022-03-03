package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {

	public static void main(String[] args) { // MAIN É UMA CLASSE EXECUTAVEL. ESTARTA O PROJETO
	
		final String url = "jdbc:sqlserver://DESKTOP-GODBMFL; databaseName=javaAula04CRUD; user=sa; password=W471984wN250299n";
																			//(1, 2)
		final String instrucao_insert = "INSERT INTO Pessoa (id, nome) VALUES (?, ?)"; // SETAR PREPAREDSTTATEMENT(?)
		
		try {
			
			// CLASSE DE CONEXÂO COM DB
			Connection conexao = DriverManager.getConnection(url); // PARÃMETRO "URL" SETADO, DIZ COM OQUE SE CONECTAR. NO CASO, COM O JDBC:SQLSERVER
			
			PreparedStatement preparacaoAtrubutosTabelaSQL = conexao.prepareStatement(instrucao_insert);
			preparacaoAtrubutosTabelaSQL.setInt(1, 15); // "1", PARÂMETRO(? = id) A SER USADO.'2'(?) TAMBÉM PODERIA SER USADO PRIMEIROO
			preparacaoAtrubutosTabelaSQL.setString(2, "Wallace"); // "2", PARÂMETRO(? = NOME)
			preparacaoAtrubutosTabelaSQL.executeUpdate();
			
			// APRESENTAÇÃO DE TESTE (NÂO OBRIGATÓRIO)
			System.out.println("Conexão estabelecida com sucesso " + conexao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
