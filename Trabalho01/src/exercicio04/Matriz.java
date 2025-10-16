package exercicio04;
import java.util.Random;

public class Matriz {

	// Atributos

	private int nLinhas;
	private int nColunas;
	private int limite;
	private int matriz[][];

	// Construtor

	public Matriz(int nLinhas, int nColunas, int limite) {
		if (nLinhas <= 0 || nColunas <= 0 || limite <= 0) {
			System.err.println("Erro!");
			System.exit(0);
		} else {
			this.nLinhas = nLinhas;
			this.nColunas = nColunas;
			this.limite = limite;
		}

		this.matriz = new int[nLinhas][nColunas];

	}

	// Métodos

	public void preencher() {

		for (int i = 0; i < nLinhas; i++) {
			for (int j = 0; j < nColunas; j++) {

				matriz[i][j] = new Random().nextInt(limite);
			}
		}

	}

	public void substituirPares(int valor) {

		for (int i = 0; i < nLinhas; i++) {
			for (int j = 0; j < nColunas; j++) {
				if (matriz[i][j] % 2 == 0) {

					matriz[i][j] = valor;
				}
			}
		}

	}

	public void imprimirInfo() {

		for (int i = 0; i < nLinhas; i++) {
			for (int j = 0; j < nColunas; j++) {

				System.out.print(matriz[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println();
	}

}
