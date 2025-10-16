package exercicio11;
public class TriEq extends PolReg {

	// Atributos

	private double altura;

	// Construtor

	public TriEq(double numeroLados, double tamanhoLado, double altura) {
		super(numeroLados, tamanhoLado);
		this.altura = altura;
	}

	// Métodos

	public double calcularPerimetro() {

		return getNumeroLados() * getTamanhoLado();

	}

	public double calcularArea() {

		return (getTamanhoLado() * altura) / 2;

	}

}
