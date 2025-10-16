package exercicio06;

public abstract class Operacao {
	
	//Atributos
	
	private int inteiro01;
	private int inteiro02;
	
	//Construtor
	
	public Operacao(int int1, int int2) {
		this.inteiro01 = int1;
		this.inteiro02 = int2;
		
	}
	
	//Métodos
	
	public abstract double operacao();

	public int getInteiro01() {
		return inteiro01;
	}

	public void setInteiro01(int inteiro01) {
		this.inteiro01 = inteiro01;
	}

	public int getInteiro02() {
		return inteiro02;
	}

	public void setInteiro02(int inteiro02) {
		this.inteiro02 = inteiro02;
	}
	
	
	
}
