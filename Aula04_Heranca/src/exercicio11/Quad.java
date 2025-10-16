package exercicio11;
public class Quad extends PolReg {

	// Construtor

	public Quad(double numeroLados, double tamanhoLado) {
		super(numeroLados, tamanhoLado);
	}

	// Métodos

	public double calcularArea() {

		return getTamanhoLado() * getTamanhoLado();

	}

}
