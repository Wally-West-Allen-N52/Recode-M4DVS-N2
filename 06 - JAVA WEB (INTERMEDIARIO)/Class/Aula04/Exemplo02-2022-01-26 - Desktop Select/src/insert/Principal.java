package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) { // MAIN � UMA CLASSE EXECUTAVEL. ESTARTA O PROJETO
	
		final String url = "jdbc:sqlserver://DESKTOP-GODBMFL; databaseName=javaAula04CRUD; user=sa; password=W471984wN250299n";
																			
		final String instrucao_select = "SELECT * FROM Pessoa";
		
		try {
			
			// CLASSE DE CONEX�O COM DB
			Connection conexao = DriverManager.getConnection(url); // PAR�METRO "URL" SETADO, DIZ COM OQUE SE CONECTAR. NO CASO, COM O JDBC:SQLSERVER
			
			PreparedStatement preparacaoAtrubutosTabelaSQL = conexao.prepareStatement(instrucao_select);
			
			// OBJ PARA RECEBER DADOS
			ResultSet recebeDadosSQL = preparacaoAtrubutosTabelaSQL.executeQuery();
			
			// PERCORRE DADOS UM-A-UM
			while(recebeDadosSQL.next()) { // SE TIVER UM PR�XIMO DADO, JAGAR NO WHILE
				
				// DADOS CRIADOS NA TABELA SQL SERVER
				int id = recebeDadosSQL.getInt("id");
				String nome = recebeDadosSQL.getString("nome");
				
				System.out.println("ID: " + id + "\nNome: " + nome);
				
			}
			
			// APRESENTA��O DE TESTE (N�O OBRIGAT�RIO)
			System.out.println("Conex�o estabelecida com sucesso " + conexao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
