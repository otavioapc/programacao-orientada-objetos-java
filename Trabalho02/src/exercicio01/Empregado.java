package exercicio01;

public abstract class Empregado {

	// Atributos

	private String nome;
	private double salarioBase;

	// Construtor

	public Empregado(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;

	}

	// Métodos

	public abstract double calcularSalario();

	public void exibirDetalhes() {

		System.out.println("Nome: " + nome);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

}
