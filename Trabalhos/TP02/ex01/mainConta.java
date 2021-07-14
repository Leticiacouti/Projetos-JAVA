package ex01;

public class mainConta {

	public static void main(String[] args) {
		
		ContaBancaria c = new ContaBancaria("Eliana", 11, 25.00,  5.00);
		c.consulta();
		
		contaPoupança c2 = new contaPoupança("Ricardo", 25, 5000.00, 3000.00);
		c2.atualiza();
			
		contaCorrente c3 = new contaCorrente("Rebecca", 50, 10.00, 9.00);
		c3.novo();
	}

}
