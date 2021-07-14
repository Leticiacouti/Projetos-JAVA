//Nome: Letícia Coutinho da Silva RA: N5752E4

package ex1;

public class ContaBancaria {
	private String Cliente;
	private String Conta;
	private double Saldo;
	
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String nomeCliente) {
		this.Cliente = nomeCliente;
	}
	
	public String getConta() {
		return Conta;
	}
	public void setConta(String numConta) {
		this.Conta = numConta;
	}
	
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		this.Saldo = saldo;
	}
	
	public String toString() {
		String s = "\nConta Especial\n";
		s += "Cliente: " + Cliente;
		s += "Conta: " + Conta;
		s += "Saldo: " + Saldo;
		return s;
	}
	
	public void depositar(double valor) {
		Saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if((Saldo-valor)>=0) {
			Saldo-= valor;
			return true;
		}
		return false;
	}
}
