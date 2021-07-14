/* Nome: Letícia Coutinho da Silva
   RA: N5752E4                     
*/

package vetores;

import java.util.Scanner;

public class Exercicio3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int qtdAluno = 0;
		double soma = 0.0; 
		double media = 0;
		
		System.out.println("Entre com a quantidade de alunos que serão cadastrados: ");
		qtdAluno = new Scanner(System.in).nextInt();
		
		String[] nome = new String[qtdAluno];
		double[] notas = new double[qtdAluno];
		
		for (int i = 0; i < qtdAluno; i++) {
			
			System.out.println("Insira o nome do aluno nº " + (i+1));
			nome[i] = new Scanner(System.in).nextLine();
			
			System.out.println("Insira a nota do aluno nº " + (i+1));
			notas[i] = new Scanner(System.in).nextDouble();
			
			soma = soma + notas[i];
			
		}
		
		media = soma / qtdAluno;
		
		System.out.printf("\nA média da turma é: %.1f\n", media);
		System.out.println("Os alunos que tiveram nota acima da média da turma foram: ");
		
		for (int i = 0; i < qtdAluno; i++) {
			
			if (notas[i] > media) {
				
				System.out.print(nome[i] + " - ");
				System.out.println(notas[i]);
				
			}
			
		}

	}

}
