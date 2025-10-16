package exercicio05;
import exercicio05.Pessoa;

public class Cliente extends Pessoa{
	
	//Atributos
	
	private double valorDivida;
	private int anoNascimento;
	
	//Construtor
	
	public Cliente(String nome, int idade, char sexo, double divida, int anoNasc) {
		super(nome, idade, sexo);
		this.valorDivida = divida;
		this.anoNascimento = anoNasc;
	}
	
	//Métodos
	
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println("Valor dívida: R$"+valorDivida);
		System.out.println("Ano nascimento: "+anoNascimento);
		
	}
	
}
