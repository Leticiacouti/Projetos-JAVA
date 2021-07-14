package ex01;

public abstract class Empregado {

	private String nome;
	
	abstract double getpagamento();

	public String getNome() {
		return nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	
}
