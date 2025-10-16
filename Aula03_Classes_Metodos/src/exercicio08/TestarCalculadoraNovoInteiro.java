package exercicio08;
public class TestarCalculadoraNovoInteiro {

	public static void main(String[] args) {

		NovoInteiro n1 = new NovoInteiro(-9);
		NovoInteiro n2 = new NovoInteiro(9);

		CalculadoraNovoInteiro calculo = new CalculadoraNovoInteiro();

		int printCalculo = calculo.dividir(n1, n2);

		System.out.println(printCalculo);
	}

}
