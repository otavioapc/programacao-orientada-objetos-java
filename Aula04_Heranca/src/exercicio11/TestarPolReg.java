package exercicio11;
import java.util.Scanner;

public class TestarPolReg {

	public static void main(String[] args) {

		Scanner mahomes = new Scanner(System.in);

		System.out.println("Informe o número de lados e o tamanho do lado:");
		double nlados = mahomes.nextDouble();
		double tlados = mahomes.nextDouble();

		if (nlados == 3) {
			System.out.println("Como é um triângulo informe a altura:");
			double altura = mahomes.nextDouble();

			TriEq triangulo = new TriEq(nlados, tlados, altura);

			System.out.println("A área: " + triangulo.calcularArea());
			System.out.println("O perímetro: "+triangulo.calcularPerimetro());

		} else if (nlados == 4) {

			Quad quadrado = new Quad(nlados, tlados);

			System.out.println("A área: " + quadrado.calcularArea());

		}
		else {
			System.err.println("Polígono não identificado!");
			System.exit(0);
		}

	}

}
