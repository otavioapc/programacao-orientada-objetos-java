package exercicio08;
import exercicio08.NovoInteiro;

public class CalculadoraNovoInteiro {

	// Aqui é feito a soma de CLASSES, como n pode ser somado o valor das classes,
	// vc deve pegar o atributo da classe da qual eles pertencem
	// e usar o método GET, pois o atributo é privado

	public int somar(NovoInteiro a, NovoInteiro b) {

		return a.getValor() + b.getValor();
	}

	public int subtrair(NovoInteiro a, NovoInteiro b) {

		return a.getValor() - b.getValor();
	}

	public int multiplicar(NovoInteiro a, NovoInteiro b) {

		return a.getValor() * b.getValor();
	}

	public int dividir(NovoInteiro a, NovoInteiro b) {

		return a.getValor() / b.getValor();
	}

}
