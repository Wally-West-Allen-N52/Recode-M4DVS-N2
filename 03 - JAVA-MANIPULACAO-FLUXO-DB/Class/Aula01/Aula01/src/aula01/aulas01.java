package aula01;

import java.util.Scanner;

public class aulas01 {

	public static void main(String[] args) {
		
		// IBST�NCIA SER� SEMPRE NO PROGRAMA PRINCIPAL
		Scanner entrada = new Scanner(System.in);
		
		float nota1, nota2, media, acumulaMedia=0, contador=0, mediaGeral;
		int opcao;
		
		do {
			System.out.print("Primeira nota: ");
			nota1 = entrada.nextFloat();
			
			System.out.print("Segunda nota 2: ");
			nota2 = entrada.nextFloat();
					
			media = (nota1 + nota2) / 2;
			contador++;
			acumulaMedia = acumulaMedia + media;
			
			if(media >= 6) {
				System.out.println("Passou com m�dia: " + media);
			} else if(media < 6) {
				System.out.println("Voc� est� de recupera��o com m�dia: " + media);
			} else {
				System.out.println(media + ": Aluno poder� fazer uma terceira avalia��o: ");
			}
			System.out.println("\nDeseja conttinuar digitando notas?\nDigite 1 para 'SIM' - 2 para 'N�o'");
			opcao = entrada.nextInt();

		} while(opcao == 1);
		
		mediaGeral = acumulaMedia / media;
		System.out.println("\nMedia geral dos alunos foi: " + mediaGeral
				+ "\nObrigado por usar esse sistema");

		entrada.close();
		
	}

}
