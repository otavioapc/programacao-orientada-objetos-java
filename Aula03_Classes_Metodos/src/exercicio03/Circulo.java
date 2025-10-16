package exercicio03;

public class Circulo {
	
	//Crie a classe Circulo que possui o atributo raio e um construtor para inicializar este raio. 
	//Se o raio for negativo, finalize a execução do programa e envie a mensagem “Raio negativo, impossível prosseguir”. 
	//Crie ainda dois métodos que irão calcular o perímetro do círculo (2*π*r) e sua área (π*r^2). 
	//Crie outra classe para testar a classe Circulo.
	
	//Atributos

	private double raio;
	
	//Construtor

	public Circulo(double raio) {
		
		if(raio > 0) {			
			this.raio = raio;
			
		}
		else {
			System.err.println("Raio negativo. Impossível prosseguir!");
			
			//Usar isso para finalizar o programa
			System.exit(0);
		}
		
	}
	
	//Métodos
	
	public double calcularPerimetro() {
				
		return  2 * Math.PI * raio;
	}
	
	public double calcularArea() {
		
		return Math.PI * (raio * raio);
	}
	

}
