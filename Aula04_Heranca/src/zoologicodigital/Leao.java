package zoologicodigital;
public class Leao extends Animal  {
	
	//Atributo
	
	private double forcaMandibula;
	
	//Construtor

	public Leao(String nome, double peso, int idade, double forcaMandibula) {
		
		super(nome, peso, idade);
		setForcaMandibula(forcaMandibula);
		
	}
	
	//Métodos
	
	public void brincar() {
		System.out.println(getNome() + " está brincando de bola");
		System.out.println("Cuidado, sua brincadeira pode machucar");
		setPeso(getPeso()-1);
		
	}
	
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println("Força mandíbula: "+forcaMandibula);
		
	}

	public double getForcaMandibula() {
		return forcaMandibula;
	}

	public void setForcaMandibula(double forcaMandibula) {
		this.forcaMandibula = forcaMandibula;
	}
	
	

}
