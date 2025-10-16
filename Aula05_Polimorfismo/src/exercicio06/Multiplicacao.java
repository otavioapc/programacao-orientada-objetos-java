package exercicio06;
public class Multiplicacao extends Operacao{
	
	//Construtor

	public Multiplicacao(int int1, int int2) {
		super(int1, int2);
	}
	
	//Métodos
	
	@Override
	public double operacao() {
		
		return getInteiro01() * getInteiro02();
	}
	
}
