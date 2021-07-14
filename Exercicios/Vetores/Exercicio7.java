/* Nome: Letícia Coutinho da Silva
   RA: N5752E4                     
*/

package vetores;

import java.util.Random;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int[] num = new int[11];
		
		System.out.println("Sorteando números...");
		
		for(int i = 0; i < num.length; i ++) {
			
			num[i] = new Random().nextInt(100);
			
		}
		
		System.out.println("Vetor desordenado:");
		for (int i = 0; i < (num.length - 1); i++) {
			System.out.println(num[i]);
		}

		int aux;
		boolean trocou = true;
		
		while(trocou) {
			trocou = false;
			
			for (int i = 0; i < num.length; i++) {
				
				if(num[i] > num[i + 1]) {
					aux = num[i];
					num[i] = num[i + 1];
					num [i + 1] = aux;
					trocou = true;
				}
				
			}
			
		}
		
		System.out.println("Vetor ordenado: ");
		for(int i = 0; i < num.length; i++) {
			
			System.out.println(num[i]);
			
		}
		
	}

}
