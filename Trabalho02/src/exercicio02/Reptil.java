package exercicio02;
public class Reptil extends Animal {

	// Atributos

	private float temperaturaCorporal;

	// Construtor

	public Reptil(String nome, int idade, float peso, float temperaturaCorporal) {
		super(nome, idade, peso);
		this.temperaturaCorporal = temperaturaCorporal;
	}

	// Métodos

	public void fazerSom() {

		System.out.println("Som de um réptil!");

	}

	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Temperatura Corporal: " + temperaturaCorporal);
	}

	public float getTemperaturaCorporal() {
		return temperaturaCorporal;
	}

	public void setTemperaturaCorporal(float temperaturaCorporal) {
		this.temperaturaCorporal = temperaturaCorporal;
	}

}
