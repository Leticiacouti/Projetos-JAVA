/* Nome: Let�cia Coutinho da Silva
   RA: N5752E4                     
*/

package vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String[] nomes;
		nomes = new String[5];
		double[] notas = new double[5];
		double soma = 0, media;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Entre com o nome do aluno n�" + (i+1));
			nomes[i] = new Scanner(System.in).nextLine();
			
			System.out.println("Entre com a nota do aluno n�" + (i+1));
			notas[i] = new Scanner(System.in).nextDouble();
			soma = soma + notas[i];
			
		}
		
		media = soma / 5;
		
		System.out.println("A m�dia dos alunos �: " + media);
		System.out.println("\n-Lista dos alunos cuja a nota � maior que a m�dia da turma-");
		
		for (int i = 0; i < 5; i++) {
			
			if (notas[i] > media) {
				
				System.out.println(nomes[i]);
				
			}
			
		}
		
	}

}
