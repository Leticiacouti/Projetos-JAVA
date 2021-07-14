package ex01;

public class FolhaPagamento {
	
public static void main(String[] args) {
		
		Empregado t1 = new EmpregadoComiss();
		System.out.println("EmpregadoComiss\n" + "Nome: " + t1.getNome() + "\nVendeu: " + ((EmpregadoComiss) t1).vendas() + "\nGanhou: " + t1.getpagamento() + " reais, mais sua taxa de comissao de: " + ((EmpregadoComiss) t1).txComissao());
		
		Empregado t2 = new EmpregadoHora();
		System.out.println("\nEmpregadoHora\n" + "Nome: " + t2.getNome() + "\nTrabalha: " + ((EmpregadoHora) t2).getNumHora() + " horas por mês" + "\nGanha por hora: " + ((EmpregadoHora) t2).getValorHora() + "\nSalário de: " + t2.getpagamento() + " reais");
		
		Empregado t3 = new EmpregadoHoraComiss();
		System.out.println("\nEmpregadoHoraComiss\n" + "Nome: " + t3.getNome() + "\nTrabalha: " + ((EmpregadoHoraComiss)t3).getNumHora() + " horas por semana" + "\nGanha: " + ((EmpregadoHoraComiss)t3).getValorHora() + " por hora"
+ ", mais sua taxa de comissão de: " + ((EmpregadoHoraComiss)t3).txComissao() + "\nSalário: " + t3.getpagamento() + " reais");
		
		
	}

	
}
