package ex01;

public class EmpregadoComiss extends Empregado implements Comissao {

	@Override
	public String getNome() {
		return "Leticia";
	}
	
	@Override
	public double txComissao() {
		return 0.10;
	}
	
	@Override
	public double vendas() {
		return 2000;
	}


	@Override
	double getpagamento() {
		return (2000 * 0.20) + 0.10;
	}

	
}
