package exercicio02;

public class Veiculo {
	
	//Atributos
	
	private double peso;
	private double velocidadeMaxima;
	private double preco;
	
	//Construtor
	
	public Veiculo() {
		
	}
	
	public Veiculo(double peso, double velocidadeMaxima, double preco) {
		this.peso = peso;
		this.velocidadeMaxima = velocidadeMaxima;
		this.preco = preco;
		
	}
	
	//Métodos
	
	public void obterInformacoesBasicas() {
		
		System.out.println("Peso: "+peso+" kg");
		System.out.println("Velocidade Máxima: "+velocidadeMaxima);
		System.out.println("Preço: R$ "+preco);
		
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
