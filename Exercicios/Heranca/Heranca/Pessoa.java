package Heranca;

import java.util.Date;

public class Pessoa {
	public String nome;
	public String cpf;
	public Date data_nascimento;
		
	public Pessoa(String _nome, String _cpf, Date _data) {
		this.nome = _nome;
		this.cpf = _cpf;
		this.data_nascimento = _data;
	}
	
	public Pessoa(String _nome) {
		this.nome = _nome;
	}
	
	public double tirarCopias(int qtd) { //Retorna o pre�o para tirar copias
		
		return 0.10 * (double) qtd;
	}
	
	
}