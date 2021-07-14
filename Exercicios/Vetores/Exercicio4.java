/* Nome: Letícia Coutinho da Silva
   RA: N5752E4                     
*/

package vetores;

import java.util.Scanner;

public class Exercicio4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double[] vSal, nSal;
		
		nSal = new double[200];
		vSal = new double[200];
		
		int cont = 1;
		vSal[0] = 1;
		
		while (vSal[(cont - 1)] != - 1) {
			
			System.out.println("Entre com o valor do " + cont + "º salário: ");
			vSal[cont] = new Scanner(System.in).nextDouble();
			cont ++;
			
		}
		
		System.out.println("Entre com o valor do reajuste em %: ");
		double reaj = new Scanner(System.in).nextDouble();
		
		for (int i = 1; i <= (cont-2); i++) {
			nSal[i] = (reaj/100) * vSal[i] + vSal[i];
			System.out.println("Salário (" + i + "). Com reajuste: " + nSal[i]);
		}
		
	}

}
