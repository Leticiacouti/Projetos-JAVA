//Nome: Letícia Coutinho da Silva RA: N5752E4

package ex01;

public class ContaBancaria {
	
	protected String nome;
	protected double saldo;
	protected int numConta;
	protected double taxa;
	protected double sacar;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getSacar() {
		return sacar;
	}

	public void setSacar(double sacar) {
		this.sacar = sacar;
	}

	public ContaBancaria(String _nome, int _numConta, double _saldo,   double _sacar) {
		
		this.nome = _nome;
		this.saldo = _saldo;
		this.numConta = _numConta;
		this.taxa = 1;
		this.sacar = _sacar;
		
	}
	

	
	public void consulta() {
		
		System.out.println("-Conta Bancaria-\n\nCliente: " + this.nome + "\nConta: " +
		this.numConta + "\nSaldo: " + this.saldo);
		
		if (sacar > saldo) {
			
			System.out.println("Saldo insuficiente para saque de: " + this.sacar +
			"\nSaldo de: " + this.saldo);
		
		} 
		else {
			
			System.out.println("Saque de: " + (this.sacar - (this.taxa / 100)) +
			" (com taxas de: " + this.taxa + "%)"  + " efetuado com sucesso, novo saldo: " +
			(this.saldo - (this.sacar - (this.taxa / 100))));
		
		}
	}

	public void atualiza() {
	}
}
