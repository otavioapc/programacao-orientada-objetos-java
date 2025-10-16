package calculadora;
public class ChamarCalculadora {

	public static void main(String[] args) {

		Calculadora c1 = new Calculadora(7, 4);
		
		c1.imprimirInfo();
		System.out.println("Operação: "+c1.dividir(10, 5));		

	}

}
