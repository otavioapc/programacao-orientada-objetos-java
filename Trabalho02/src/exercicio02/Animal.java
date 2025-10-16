package exercicio02;

public class Animal {

	// Atributos

	private String nome;
	private int idade;
	private float peso;

	// Construtor

	public Animal(String nome, int idade, float peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	// Métodos

	public void fazerSom() {

		System.out.println("Som de um animal!");

	}

	public void exibirInformacoes() {

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
