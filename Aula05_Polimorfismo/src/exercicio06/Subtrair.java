package exercicio06;
public class Subtrair extends Operacao{
	
	//Construtor

	public Subtrair(int int1, int int2) {
		super(int1, int2);
	}
	
	@Override
	public double operacao() {
		
		return getInteiro01() - getInteiro02();
	}
	
}
