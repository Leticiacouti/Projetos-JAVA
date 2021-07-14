package ex01;

public class EmpregadoHoraComiss extends EmpregadoHora implements Comissao{

	@Override
	public String getNome() {
		
		return "Vanessa";
		
	}

	@Override
	public double getValorHora() {
		
		return 9;
		
	}
	
	@Override
	public int getNumHora() {
		
		return 42;
		
	}
	
	@Override
	double getpagamento() {
		
		return ((42 * 9) * 4) + 0.10;
		
	}
	
	@Override
	public double txComissao() {
		return 0.1;
		
	}

	@Override
	public double vendas() {
		return 500;
	}
}
