package exercicio08;

public class NovoInteiro {

//Crie uma classe para representar números inteiros denominada NovoInteiro. 
//Esta classe deverá ter o atributo valor que assumirá valores (inteiros) apenas entre -100 e 100. 
//Crie agora, outra classe, denominada CalculadoraNovoInteiro que irá possuir os métodos (recebem 2 objetos do tipo NovoInteiro) para somar, subtrair, dividir e multiplicar. 
//Crie uma classe para testar as operações da classe CalculadoraNovoInteiro

	// Atributos

	private int valor;

	// Construtor

	public NovoInteiro(int numero) {

		if (numero >= -100 && numero <= 100) {
			this.valor = numero;
		} else {
			System.err.println("Erro!");
			System.exit(0);
		}
	}

	// Método

	public int getValor() {
		return valor;
	}

}
