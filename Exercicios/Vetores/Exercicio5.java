/* Nome: Letícia Coutinho da Silva
   RA: N5752E4                     
*/

package vetores;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int[] n = new int[50];
		int cont = 0;
		
		for (int i = 101; i < 151; i ++) {
			
			n[cont] = i;
			cont ++;
			System.out.printf("A %d posição do vetor tem o valor: %d \n", cont, n[cont - 1]);
			
		}

	}

}
