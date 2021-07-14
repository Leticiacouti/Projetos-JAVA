package Professor;

public class profHorista extends professor {

	private float salarioHora;
	private int totalHoras;
	
	public profHorista(String _nome, String _matricula, int _idade, int _horas, float _valorHora) {
		
		super(_nome, _matricula, _idade);
		
		this.totalHoras = _horas;
		this.salarioHora = _valorHora;
		
	}
	
	public float retornaSalario() {
		
		float salarioBase = salarioHora * totalHoras;
		return salarioBase = salarioBase * 0.8f;
		
		
	}
	
	public int getTotalHoras() {
		
		return totalHoras;
		
	}
	
	
	
}
