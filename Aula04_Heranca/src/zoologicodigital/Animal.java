package zoologicodigital;

public class Animal {

	// Atributos

	private String nome;
	private double peso;
	private int idade;

	// Construtor

	public Animal(String nome, double peso, int idade) {
		setNome(nome);
		setPeso(peso);
		setIdade(idade);

	}

	// Métodos

	public void obterInformacoesBasicas() {

		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("Idade: " + idade);


	}

	public void comer(String comida) {
		System.out.println(nome + " está comendo " + comida);

	}


	// Métodos Get e Set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
