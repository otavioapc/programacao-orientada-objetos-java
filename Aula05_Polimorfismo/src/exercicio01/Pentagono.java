package exercicio01;

public class Pentagono extends PoligonoRegular{
	
	//Construtor
	
	//Aqui não preciso passar nLados, pois um pentágono sempre vai ter 5 lados
	public Pentagono(double tamLado, double anguloInterno) {
		super(5, tamLado, anguloInterno);
				
	}
			
	//Métodos
	
	@Override
	public double calcularArea() {
		
		return (5 * Math.pow(getTamLado(), 2)) / (4 * Math.tan(36));
	}
	
	@Override
	public double calcularPerimetro() {
		
		return getTamLado() * getnLados();
	}

}
