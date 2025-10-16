package exercicio01;
import java.util.Scanner;

public class TestarPoligonoRegular {

	public static void main(String[] args) {

		Scanner mahomes = new Scanner(System.in);
		Engenheiro eng = new Engenheiro("Daniel");

		System.out.println("Informe a quantidade de lados:");
		int qLados = mahomes.nextInt();
		System.out.println("Informe o tamanho do lado:");
		double tLado = mahomes.nextDouble();

		if (qLados == 3) {

			Triangulo trian = new Triangulo(tLado, 60);
			eng.calcular(trian);

		} else if (qLados == 4) {
			
			Quadrado quad = new Quadrado(tLado, 90);
			eng.calcular(quad);
			
			
		}
		else if (qLados == 5) {
			
			Pentagono pent = new Pentagono(tLado, 108);
			eng.calcular(pent);
			
		}
		else {
			
			System.err.println("Erro!");
			System.exit(0);
			
		}

	}

}
