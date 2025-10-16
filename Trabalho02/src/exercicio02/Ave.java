package exercicio02;
public class Ave extends Animal{
	
	//Atributos
	
	private float envergaduraAsas;
	
	//Construtor
	
	public Ave(String nome, int idade, float peso, float envergaduraAsas) {
		super(nome, idade, peso);
		this.envergaduraAsas = envergaduraAsas;
	}
	
	//Métodos
	
	public void fazerSom() {
		
		System.out.println("Som de uma ave!");
		
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Envergadura das asas: "+envergaduraAsas);
		
	}

	public float getEnvergaduraAsas() {
		return envergaduraAsas;
	}

	public void setEnvergaduraAsas(float envergaduraAsas) {
		this.envergaduraAsas = envergaduraAsas;
	}
	
}
