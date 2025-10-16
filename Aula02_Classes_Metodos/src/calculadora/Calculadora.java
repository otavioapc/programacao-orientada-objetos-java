package calculadora;

public class Calculadora {

	// Atributos

	private double tamanho;
	private int quantOperadores;

	public Calculadora(double tamanho, int quantOperadores) {
		this.tamanho = tamanho;
		this.quantOperadores = quantOperadores;

	}

	public double somar(double n1, double n2) {

		return n1 + n2;
	}

	public double subtrair(double n1, double n2) {

		return n1 - n2;
	}

	public double dividir(double n1, double n2) {

		return n1 / n2;
	}

	public double multiplicar(double n1, double n2) {

		return n1 * n2;
	}

	public void imprimirInfo() {
		
		System.out.println("Atributos");
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Quantidade de Operadoreso: " + quantOperadores);

	}

}
