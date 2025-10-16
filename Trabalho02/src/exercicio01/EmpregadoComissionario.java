package exercicio01;
public class EmpregadoComissionario extends Empregado {

	// Atributos

	private double vendas;
	private double percentualComissao;

	// Construtor

	public EmpregadoComissionario(String nome, double salarioBase, double vendas, double percentualComissao) {
		super(nome, salarioBase);
		this.vendas = vendas;
		this.percentualComissao = percentualComissao;

	}

	// Métodos

	public double calcularSalario() {

		return getSalarioBase() + (vendas * (percentualComissao / 100));
	}

	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Salário: R$" + calcularSalario());
	}

}
