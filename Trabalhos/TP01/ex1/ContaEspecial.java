//Nome: Letícia Coutinho da Silva RA: N5752E4

package ex1;

public class ContaEspecial extends ContaBancaria{
	private double limite;
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public String toString() {
		String s = "\n-Conta Especial-\n";
		s += "Limite: " + limite;
		s += super.toString();
		return s;
	}
	public boolean sacar (double valor) {
		double saldoComLimite = this.getSaldo() + limite;
		
		if ((saldoComLimite-valor)>=0) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		return false;
	}
}
