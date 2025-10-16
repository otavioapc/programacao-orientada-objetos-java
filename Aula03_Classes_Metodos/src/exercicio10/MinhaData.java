package exercicio10;

public class MinhaData {

//	Crie uma classe que representa uma data (dia, mês, ano). Sua classe deverá ter dois construtores. 
//	O primeiro não possui atributos e desta forma deverá criar uma data default (01/01/2019). 
//	O segundo construtor deverá receber três atributos (dia, mês, ano) e validar as seguintes regras: 
//	●	O dia deverá estar entre 1 e 30, caso contrário, será configurado para 1
//	●	O mês deverá estar entre 1 e 12, caso contrário, será configurado para 1
//	●	O ano deverá sempre ser maior ou igual a 2019, caso contrário, será configurado para 2019.
//	Forneça um método para avançar a data em um 1 e outro método para imprimir a data. Crie uma classe para testar a classe Data. 
//	OBS: considere todos os meses com 30 dias. Atenção com a virada de dia, mês e ano.

	// Atributos

	private int dia;
	private int mes;
	private int ano;

	// Construtores

	private MinhaData() {
		this.dia = 01;
		this.mes = 01;
		this.ano = 2019;

	}

	public MinhaData(int dia, int mes, int ano) {

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
	
	public void avancarData() {
		if(dia < 30) {
			dia++;
		}
		if(dia > 30) {
			dia = 01;
			mes++;
		}
		if(mes > 12) {
			mes = 01;
			ano++;
		}
		
	}
	
	public void retrocederData() {
		if(dia <= 30) {
			dia--;			
		}
		if(dia < 1) {
			dia = 30;
			mes--;
		}
		if(mes < 1) {
			mes = 12;
			ano--;
		}
		
	}
	
	
	
	public void imprimirData() {
		System.out.println("Data: "+dia+"/"+mes+"/"+ano);
		
	}
	
	

}
