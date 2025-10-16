//16.	Crie uma classe Peixe que herde da classe Animal e obedeça à seguinte descrição:
//●	possua um atributo característica (String).
//●	Crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos (incluindo os atributos da classe Animal) e atribua-os aos seus respectivos atributos.
//●	Crie ainda os métodos get e set para o atributo característica. 
//●	Crie um método imprimir sem parâmetro e do tipo void, que, quando chamado, imprime na tela uma espécie de relatório informando os dados do peixe (incluindo os dados do Animal e mais a característica).
package exercicio15;

public class Peixe extends Animal{
	
	//Atributos
	
	private String caracteristica;
	
	//Construtor
	
	public Peixe(String nome, double comp, int numPatas, String cor, String ambiente, double velMed, String caract) {
		super(nome, comp, numPatas, cor, ambiente, velMed);
		this.caracteristica = caract;
	}
	
	//Métodos
	
	public void relatorioAnimal() {
		super.relatorioAnimal();
		System.out.println("Característica: "+caracteristica);
		
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
		
}
