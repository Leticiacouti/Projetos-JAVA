package Heranca;

import java.util.Date;

public class Funcionario extends Pessoa {
	
	public Funcionario(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	
	public double tirarCopias(int qtd) { //Preço para tirar copias para alunos
		return 0.08 * (double) qtd;
	}
	
	public double salario;
	public Date data_admissao;
	public String cargo;
}