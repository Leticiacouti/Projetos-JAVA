/* Nome: Letícia Coutinho da Silva
   RA: N5752E4                     
*/



package vetores;

import java.util.Scanner;

public class Exercicio8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int i;
		System.out.println("Quantas pessoas serão cadastradas?");
		i = new Scanner(System.in).nextInt(); 
		i++;
		
		String [] nome = new String[i];
		
		for(int j = 0; j < (i-1); j++) {
			
			System.out.printf("Digite o nome da %da. pessoa:", j+1);
			nome[j] = new Scanner(System.in).next();
			
		}
		
		System.out.println("\nVetor desordenado");
		
		for (int j = 0; j < (i-1); j++) {
			
			System.out.println(nome[j]);
			
		}
		
		String aux;
		boolean trocou = true;
		
		while(trocou) {
			trocou = false;
			for (int j = 0; j < (i-1); j++) {
				if((nome[j+1] != null) && (nome[j].compareTo(nome[j+1]) > 0)) {
					aux = nome[j];
					nome[j] = nome[j+1];
					nome[j+1] = aux;
					trocou = true;
					
				}
				
			}
			
		}
		
		System.out.println("\nVetor ordenado");
		for (int j = 0; j < (i-1); j++) {
			
			System.out.println(nome[j]);
			
		}

	}

}
