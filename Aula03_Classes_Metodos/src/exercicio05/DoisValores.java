package exercicio05;

public class DoisValores {
	
	//Atributos
	
	private int numero01;
	private int numero02;
	
	//Construtor
	
	public DoisValores (int numero01, int numero02) {
		this.numero01 = numero01;
		this.numero02 = numero02;
	}
	
	//Método
	
	public void maiorNumero() {
		
		
		if(numero01 > numero02) {
			System.out.println("O maior número: "+numero01);
			
		}
		if(numero01 < numero02) {
			System.out.println("O maior número: "+numero02);
			
		}
		
	}

}
