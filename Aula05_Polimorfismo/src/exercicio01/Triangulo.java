package exercicio01;

public class Triangulo extends PoligonoRegular{
	
	//Construtor
	
	public Triangulo(double tamLado, double anguloInterno) {
		super(3, tamLado, anguloInterno);
		
	}
	
	//Métodos
	
	@Override
	public double calcularArea() {
		
		return (Math.pow(getTamLado(), 2) * Math.sqrt(3)) / 4;
		
	}
	
	@Override
	public double calcularPerimetro() {
		
		return getTamLado() * getnLados();
		
	}


}
