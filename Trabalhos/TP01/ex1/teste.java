//Nome: Letícia Coutinho da Silva RA: N5752E4

package ex1;

public class teste {
public static void main(String[] args) {
		
		System.out.println("-Teste ContaBancaria-\n");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setCliente("Letícia\n");
		contaSimples.setConta("1104\n");
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, (50 + (0.3)));
		System.out.println("Taxa de 0.3% aplicada ao saque");
		
		realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);
		
		//Conta Especial
		
		System.out.println("\n-Teste ContaEspecial-\n");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setCliente("Melissa\n");
		contaEspecial.setConta("2205\n");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial + "\n");
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso!\n" + "Novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("\nSaldo insuficiente para saque de " + valor +  "\nSaldo de " + conta.getSaldo());
		}
	}
}
