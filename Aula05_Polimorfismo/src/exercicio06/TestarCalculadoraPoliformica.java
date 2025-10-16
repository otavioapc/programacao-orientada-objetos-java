package exercicio06;
public class TestarCalculadoraPoliformica {

	public static void main(String[] args) {
		
		Somar soma = new Somar(5, 5);
		
		CalculadoraPoliformica cp = new CalculadoraPoliformica();
		
		System.out.println(cp.executar(soma));
		

	}

}
