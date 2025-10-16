package zoologicodigital;
public class Arara extends Animal {
	
	//Atributos
	
	private double envergadura;
	
	//Construtor

	public Arara (String nome, double peso, int idade, double envergadura) {
		
		super(nome, peso, idade);
		setEnvergadura(envergadura);
			
	}
	
	//Métodos

	public void brincar() {
		System.out.println(getNome() + " brincando de perseguir outro pássaro");
		
	}
	
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println("Envergadura: "+envergadura);
		
	}

	public double getEnvergadura() {
		return envergadura;
	}

	public void setEnvergadura(double envergadura) {
		this.envergadura = envergadura;
	}
	
	
	
	
}
