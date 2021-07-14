package ex01;

public class EmpregadoHora extends Empregado{

	public double getValorHora() {
		return 12;
	}

	public void setValorHora(double valorHora) {
	}

	public int getNumHora() {
		return 208;
	}

	public void setNumHora(int numHora) {
	}

	@Override
	public String getNome() {
		return "Jorge";
	}
	

	@Override
	double getpagamento() {
		return 208 * 12;
	}

	
}
