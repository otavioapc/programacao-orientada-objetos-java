//17.	Crie uma classe Mamifero que herde da classe Animal e obedeça à seguinte descrição:
//●	possua um atributo alimento (String)
//●	Crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos (incluindo os atributos da classe Animal) e atribua-os aos seus respectivos atributos.
//●	Crie ainda os métodos get e set para o atributo alimento. 
//●	Crie um método imprimir sem parâmetro e do tipo void, que, quando chamado, imprime na tela uma espécie de relatório informando os dados do mamífero (incluindo os dados do Animal e mais o alimento).
package exercicio15;

public class Mamifero extends Animal{
	
	//Atributos
	
	private String alimento;
	
	//Construtor
	
	public Mamifero(String nome, double comp, int numPatas, String cor, String ambiente, double velMed, String alimento) {
		super(nome, comp, numPatas, cor, ambiente, velMed);
		this.alimento = alimento;
	}
	
	//Métodos
	
	public void relatorioAnimal() {
		super.relatorioAnimal();
		System.out.println("Alimento: "+alimento);
		
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
		
}
