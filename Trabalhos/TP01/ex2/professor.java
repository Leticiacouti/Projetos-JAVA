//Nome: Letícia Coutinho da Silva RA: N5752E4

package ex2;

public class professor {
	
	private String nome;
	private String matricula;
	private int idade;
	
	public professor(String _nome, String _matricula, int _idade) {
		
		this.nome = _nome;
		this.matricula = _matricula;
		this.idade = _idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	public int getIdade() {
		
		if(this.idade < 0) {
			
			System.out.println("Favor preencher a idade corretamente!");

		}
		return this.idade;
	}
	
	public float retornaSalario() {
		return 0;
	}
}
