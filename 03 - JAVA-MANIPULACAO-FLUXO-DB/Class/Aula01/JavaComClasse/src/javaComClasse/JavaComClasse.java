package javaComClasse;

import java.util.Scanner;

public class JavaComClasse {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

	
		// PODEMOS INST�NCIAR UM SEGUNDO PRODUTO DE FORMA DIFERENTE
		Produto produtinho = new Produto();
		Cliente clientinho = new Cliente();

		int opcao, resposta;
 
		do { 
			System.out.print("Digite:\n1 - Cadastro de produto\n2 - Cadastroo de cliente\n");
			opcao = read.nextInt();
			switch (opcao) {
			case 1: {
				System.out.println("Digite o C�digo do produto:");
				produtinho.setCod(read.nextInt());
				System.out.println("Descri��o do produto");
				produtinho.setDescricao(read.next());
				System.out.println("Pro�o do produto $");
				produtinho.setPreco(read.nextDouble());
				
				System.out.println(produtinho.toString());
				break;
			}
			case 2: {
				
				System.out.println("Data Cadastro Cliente: "); 
				clientinho.setDataCadastro(read.next()); // "ENDERE�O" HERDADO DA CLASSE "CLIENTE"
			}
			default:
				System.out.println("Dados invalidos!");
			}
			System.out.println("\nDeseja realiza novo cadastro?\n1 para 'SIM'\n2 para 'N�O");
			resposta = read.nextInt();
		} while (resposta == 1);
		 		
		read.close();
	}

}
