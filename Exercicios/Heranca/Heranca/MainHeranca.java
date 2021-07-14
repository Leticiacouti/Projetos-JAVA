package Heranca;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainHeranca {

	public static void main(String[] args) throws ParseException {
						
		SimpleDateFormat formato =  new SimpleDateFormat("yyyy-MM-dd");		
		
		Funcionario Func = new Funcionario("Joseh Carlos", "192.567.475-01", new Date());
		Func.salario=2000.00;
		Func.cargo="Seguranca";
		Func.data_admissao = (Date)formato.parse("2017-01-01");
		
		System.out.println("Abaixo os dados do funcionario\n\nNome: " + Func.nome);
		System.out.println("Cargo: " + Func.cargo);
		System.out.println("Salario: " + Func.salario);
		System.out.println("CPF: " + Func.cpf);
		System.out.println("Data de admissao: " + formato.format(Func.data_admissao));

		Professor prof = new Professor("Thiago", "123.456.789-0",(Date)formato.parse("1955-03-20"));
		prof.disciplina = "TEPOO";
		prof.salario = 10000000.00;
		
		System.out.println("\nAbaixo os dados do professor\n\nNome: " + prof.nome);
		System.out.println("Disciplina: " + prof.disciplina);
		System.out.println("Salario: " + prof.salario);
		System.out.println("CPF: " + prof.cpf);
		
		
		Aluno Student = new Aluno("Mauro Silva", "123.654.987-99", new Date());
		Student.matricula = "123456";
		System.out.println("\nAbaixo os dados do aluno\n\nNome: " + Student.nome);
		System.out.println("CPF: " + Student.cpf);
		System.out.println("Data de nascimento: " + Student.data_nascimento.toString());
		System.out.println("O numero da matricula do " + Student.nome + " eh: " + Student.matricula);
		System.out.println("O preco da copia do aluno eh: " + Student.tirarCopias(1));
		System.out.println("O preco da copia do funcionario eh: " + Func.tirarCopias(1));
		System.out.println("O preco da copia do professor eh: " + prof.tirarCopias(1));
		System.out.println("O preco da copia do aluno nao TCC eh: " + Student.tirarCopias(1,false));
		System.out.println("O preco da copia do aluno para TCC eh: " + Student.tirarCopias(1,true));
					
		
	}

}
