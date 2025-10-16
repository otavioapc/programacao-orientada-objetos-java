//15.	Crie uma classe Animal que obedeça à seguinte descrição:
//●	possua os atributos nome (String), comprimento (float), número de patas (int), cor (String), ambiente (String) e velocidade média (float)
//●	Crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos e atribua-os aos seus respectivos atributos.
//●	Crie os métodos get e set para cada um dos atributos. 
//●	Crie um método imprimir, sem parâmetro e do tipo void, que, quando chamado, imprime na tela uma espécie de relatório informando os dados do animal
package exercicio15;

public class Animal {
	
	//Atributos 
	
	private String nome;
	private double comprimento;
	private int numPatas;
	private String cor;
	private String ambiente;
	private double velocidadeMedia;
	
	//Construtor
	
	public Animal(String nome, double comp, int numPatas, String cor, String ambiente, double velMed) {
		this.nome = nome;
		this.comprimento = comp;
		this.numPatas = numPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velMed;
	}
	
	//Métodos
	
	public void relatorioAnimal() {
		System.out.println("Nome: "+nome);
		System.out.println("Comprimento: "+comprimento);
		System.out.println("Nº patas: "+numPatas);
		System.out.println("Cor: "+cor);
		System.out.println("Ambiente: "+ambiente);
		System.out.println("Velocidade média: "+velocidadeMedia);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	

}
