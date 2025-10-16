package exercicio05;
import exercicio05.Pessoa;

public class Empregado extends Pessoa {
	
	//Atributos
	
	private double salario;
	private String matricula;
	
	//Construtor
	
	public Empregado(String nome, int idade, char sexo, double salario, String matricula) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.matricula = matricula;
		
	}

	//Métodos
	
	public double valorINSS() {
		
		return salario * 0.11;
		
	}
	
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println("Salário: R$ "+salario);
		System.out.println("Matrícula: "+matricula);
		
	}
	
}
