//Nome: Let�cia Coutinho da Silva RA: N5752E4

package ex2;

import java.util.Scanner;

public class mainProfessor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o nome do professor: ");
		String prof = entrada.next();
		
		//professor p = new professor(prof, "THN241", 43);
		//System.out.println("O sal�rio do professor " + p.getNome()+ " �: " + p.retornaSalario());
		
		entrada.close();
		
		profHorista pH = new profHorista(prof,"JLM1324", 54, 112, 65);
		System.out.println("O sal�rio do(a) professor(a) horista " + pH.getNome() + " de " + pH.getIdade() + " anos, de matricula "
		+ pH.getMatricula() + ", que trabalhou " + pH.getTotalHoras() + " horas � de: " + pH.retornaSalario());
		
		profRegime pR = new profRegime("Luis", "POY2141", 32, 4300);
		System.out.println("O sal�rio do(a) professor(a) Regime " + pR.getNome() + " de " + pR.getIdade() + " anos, de matricula " 
		+ pR.getMatricula() + " e seu sal�rio � de " + pR.getSalario());
	}

}
