package exercicio05;
public class Vendedor extends Empregado {

	// Atributos

	private int qtdeVendas;
	private double valorVenda;

	// Construtor

	public Vendedor(String nome, int idade, char sexo, double salario, String matricula, int qtdeVendas, double valorVenda) {
		super(nome, idade, sexo, salario, matricula);
		this.qtdeVendas = qtdeVendas;
		this.valorVenda = valorVenda;
	}

	// Métodos
	
	public double totalVendas() {
		
		return qtdeVendas * valorVenda;
		
	}
	
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println("Qtde vendas: "+qtdeVendas);
		System.out.println("Valor venda: R$"+valorVenda);
	}

}
