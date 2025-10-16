package exercicio01;
public class EmpregadoHorista extends Empregado {

	// Atributos

	private int horasTrabalhadas;
	private double valorHora;

	// Construtor

	public EmpregadoHorista(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
		super(nome, salarioBase);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;

	}

	// Métodos

	public double calcularSalario() {

		return horasTrabalhadas * valorHora;

	}

	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Salário: R$" + calcularSalario());
	}

}
