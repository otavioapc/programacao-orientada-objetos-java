package exercicio05;
public class Gerente extends Empregado{
	
	//Atributos
	
	private String nomeGerencia;
	
	//Construtor
	
	public Gerente(String nome, int idade, char sexo, double salario, String matricula, String nomeGerencia) {
		super(nome, idade, sexo, salario, matricula);
		this.nomeGerencia = nomeGerencia;
	}
	
	//Métodos
	
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println("Gerência: "+nomeGerencia);
	}

}
