//Nome: Letícia Coutinho da Silva RA: N5752E4

package ex01;

public class contaCorrente extends ContaBancaria{
	
	public contaCorrente(String _nome, int _numConta, double _saldo, double _sacar) {
		super(_nome, _numConta, _saldo, _sacar);
		this.taxa = 2;
		this.nome = _nome;
		this.saldo = _saldo - 0.10;
		this.numConta = _numConta;
		this.sacar = _sacar;
	}
	
	public void novo(){
		System.out.println("\n-Conta Corrente-\n\nCliente: " + this.nome + "\nConta: " +
		this.numConta + "\nSaldo: " + this.saldo);
		
		if (sacar > saldo) {
			System.out.println("Saldo insuficiente para saque de: " + this.sacar +
			"\nSaldo de: " + this.saldo);
		} else {
			System.out.println("Saque de: " + (this.sacar - (this.taxa / 100)) +
			" (com taxas de: " + this.taxa + "%)"  + " efetuado com sucesso, novo saldo: " +
			(this.saldo - (this.sacar - (this.taxa / 100))));
		}
}
}
