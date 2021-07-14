/* Nome: Letícia Coutinho da Silva
   RA: N5752E4                     
*/

package vetores;

import java.util.Scanner;

public class Exercicio6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int i;
		System.out.println("Quantas pessoas serão cadastradas?");
		i = new Scanner(System.in).nextInt();
		int [] tel = new int[i];
		String [] nome = new String[i];
		
		for (int j = 0; j < i; j++) {
			
			System.out.printf("Digite o nome da %da. pessoa: ", (j+1));
			nome[j] = new Scanner(System.in).next();
			System.out.printf("Digite o telefone1 da %da. pessoa: ", (j+1));
			tel[j] = new Scanner(System.in).nextInt();
			System.out.println();
			
		}
		
		String buscaNome;
		System.out.println("Digite o nome do cliente: ");
		buscaNome = new Scanner(System.in).next();
		boolean inexistente = true;
		
		for(int x = 0; x<nome.length; x++) {
			if(buscaNome.equals(nome[x])) {
				
				System.out.println(nome[x]);
				System.out.println(tel[x]);
				inexistente = false;		
		}
			
		}
		
		if (inexistente) {
			System.out.println("Nome inexistente!");
		}

	}

}
