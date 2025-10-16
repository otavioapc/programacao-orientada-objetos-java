package exercicio02;
public class CarroPasseio extends Veiculo {
	
//	Crie agora a classe CarroPasseio, derivada da classe Veiculo. 
//	Inclua os atributos marca e cor. 
//	Crie um construtor para esta classe (deve chamar também o construtor da classe mãe), os métodos getters e setters e o método obterInformacoesBasicas. 

	
	//Atributos
	
	private String marca;
	private String cor;
	
	//Construtor
	
	public CarroPasseio (double peso, double velocidadeMaxima, double preco, String marca, String cor) {
		super(peso, velocidadeMaxima, preco);
		this.marca = marca;
		this.cor = cor;
		
	}
	
	//Métodos
	
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println("Marca: "+marca);
		System.out.println("Cor: "+cor);
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
