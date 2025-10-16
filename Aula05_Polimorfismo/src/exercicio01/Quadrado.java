package exercicio01;

public class Quadrado extends PoligonoRegular{
	
	//Construtor
	
	public Quadrado(double tamLado, double anguloInterno) {
		super(5, tamLado, anguloInterno);
			
	}
		
	//Métodos
	
	@Override
	public double calcularArea() {
		
		return Math.pow(getTamLado(), 2);
	}
	
	@Override
	public double calcularPerimetro() {
		
		return getTamLado() * getnLados();
	}
	
}
