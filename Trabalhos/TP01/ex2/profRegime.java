//Nome: Letícia Coutinho da Silva RA: N5752E4

package ex2;

public class profRegime extends professor {
	
	private float salario;
	
	public profRegime(String _nome, String _matricula, int _idade, float _valorSalario) {
		super(_nome, _matricula, _idade);
		
		if(_valorSalario > 0) {
			
			salario = _valorSalario;
			
		}
	}

	public float getSalario() {
		return salario = salario * 0.8f;
	}
	
}
