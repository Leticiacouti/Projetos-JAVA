/* Nome: Letícia Coutinho da Silva
   RA: N5752E4                     
*/

package vetores;

import java.util.Scanner;

public class Exercicio2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int quantidade;
		double media = 0;
		
		System.out.println("Informe a quantidade de notas:");
		
		quantidade = new Scanner(System.in).nextInt();
		
		double vetor[];
		vetor = new double[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			
			System.out.println("\nInforme a " + (i+1) + "a nota");
			vetor[i] = new Scanner(System.in).nextDouble();
			
			media = media + vetor[i];
			
		}
		
		media = media / quantidade;
		
		System.out.println("\nA média é: " + media);
		String maior = "\nNota(s) acima da média: ", menor = "Nota(s) abaixo da média: ";
		
		for (int i = 0; i < quantidade; i++) {
			
			if (vetor[i] > media) {
				
				maior = maior + vetor[i] + "";
			
			}else if(vetor[i] < media) {
				
				menor = menor + vetor[i];
				
			}
			
		}
		
		System.out.println(maior);
		System.out.println("\n" + menor);
	}

}
