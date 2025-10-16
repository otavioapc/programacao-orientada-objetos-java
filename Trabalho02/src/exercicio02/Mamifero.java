package exercicio02;
public class Mamifero extends Animal {

	// Atributos

	private float velocidade;

	// Construtor

	public Mamifero(String nome, int idade, float peso, float velocidade) {
		super(nome, idade, peso);
		this.velocidade = velocidade;
	}

	// Métodos

	public void fazerSom() {

		System.out.println("Som de um mamífero!");

	}

	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Velocidade: " + velocidade);
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

}
