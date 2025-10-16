package exercicio01;
public class EmpregadoAssalariado extends Empregado {

	// Construtor

	public EmpregadoAssalariado(String nome, double salarioBase) {
		super(nome, salarioBase);

	}

	// Métodos

	public double calcularSalario() {

		return getSalarioBase();
	}

	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Salário: R$" + calcularSalario());
	}

}
