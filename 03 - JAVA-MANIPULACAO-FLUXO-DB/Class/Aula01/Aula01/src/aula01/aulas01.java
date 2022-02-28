package aula01;

import java.util.Scanner;

public class aulas01 {

	public static void main(String[] args) {
		
		// IBSTÂNCIA SERÁ SEMPRE NO PROGRAMA PRINCIPAL
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
				System.out.println("Passou com média: " + media);
			} else if(media < 6) {
				System.out.println("Você está de recuperação com média: " + media);
			} else {
				System.out.println(media + ": Aluno poderá fazer uma terceira avaliação: ");
			}
			System.out.println("\nDeseja conttinuar digitando notas?\nDigite 1 para 'SIM' - 2 para 'Não'");
			opcao = entrada.nextInt();

		} while(opcao == 1);
		
		mediaGeral = acumulaMedia / media;
		System.out.println("\nMedia geral dos alunos foi: " + mediaGeral
				+ "\nObrigado por usar esse sistema");

		entrada.close();
		
	}

}
