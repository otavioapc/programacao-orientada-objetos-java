package exercicio03;
public class Data {

	// Atributos

	private int dia;
	private int mes;
	private int ano;

	// Construtores

	private Data() {
		this.dia = 01;
		this.mes = 01;
		this.ano = 2019;

	}

	public Data(int dia, int mes, int ano) {

		if (dia >= 1 && dia <= 30) {
			this.dia = dia;

		} else {
			this.dia = 01;

		}

		if (mes >= 1 && mes <= 12) {
			this.mes = mes;

		} else {
			this.mes = 01;

		}
		if (ano >= 2019) {
			this.ano = ano;

		} else {
			this.ano = 2019;

		}

	}

	// Métodos

	public void avancarData() {
		if (dia <= 30) {
			dia++;
		}
		if (dia > 30) {
			dia = 01;
			mes++;
		}
		if (mes > 12) {
			mes = 01;
			ano++;
		}

	}

	public void imprimirData() {
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);

	}

}

