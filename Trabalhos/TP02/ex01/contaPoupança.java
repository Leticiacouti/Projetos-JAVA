//Nome: Letícia Coutinho da Silva RA: N5752E4

package ex01;

public class contaPoupança extends ContaBancaria{
	
	public contaPoupança(String _nome, int _numConta, double _saldo, double _sacar) {
		
		super(_nome, _numConta, _saldo,  _sacar);
		
		this.taxa = 3;
		this.nome = _nome;
		this.saldo = _saldo;
		this.numConta = _numConta;
		this.sacar = _sacar;
	}
	
	
	public void atualiza(){
		
			System.out.println("\n-Conta Poupança-\n\nCliente: " + this.nome + "\nConta: " +
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
}
