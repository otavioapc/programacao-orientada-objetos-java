package exercicio02;
public class Caminhao extends Veiculo{
	
//	Crie agora a classe Caminhão, derivada da classe Veiculo. Inclua os atributos tonelada, altura máxima e comprimento. 
//	Crie um construtor para esta classe (deve chamar também o construtor da classe mãe), os métodos getters e setters e o método obterInformacoesBasicas. 
//	Teste sua aplicação
	
	//Atributos
	
	private double tonelada;
	private double alturaMax;
	private double comprimento;
	
	//Construtor
	
	public Caminhao(double peso, double velocidadeMaxima, double preco, double tonelada, double alturaMax, double comprimento) {
		super(peso, velocidadeMaxima, preco);
		this.tonelada = tonelada;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
		
	}
	
	//Métodos
	
	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println("Tonelada: "+tonelada+" t");
		System.out.println("Altura Máxima: "+alturaMax+" m");
		System.out.println("Comprimento: "+comprimento+" m");
		
	}

}
