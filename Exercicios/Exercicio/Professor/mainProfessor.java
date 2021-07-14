package Professor;

import java.util.Scanner;

public class mainProfessor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o nome do professor: ");
		
		String prof = entrada.next();		
		
		professor p = new professor(prof, "123.456.234", 50);
		
		//System.out.println("O sal�rio do professor " + p.getNome() + " �: " + p.retornaSalario());
		
		entrada.close();
		
		profHorista pH = new profHorista(prof, "124.567.890", 40, 112, 65);
		
		System.out.println("O salario do prof horista " + pH.getNome() + " , que "
				+ "trabalho " + pH.getTotalHoras() + " horas �: " + pH.retornaSalario());
		
		profRegime pR = new profRegime(prof, "845.678.945", 38, 5000);
		
		System.out.println("O sal�rio do professor " + pR.getNome() + " de matr�cula: " + pR.getMatricula() + " que "
				+ "tem " + pR.getIdade() + " anos, � de: " + pR.getSalario());
		

	}

}
