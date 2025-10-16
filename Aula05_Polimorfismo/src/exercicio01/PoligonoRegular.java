package exercicio01;

public abstract class PoligonoRegular {
	
	//Atributos
	
	private int nLados;
	private double tamLado;
	private double anguloInterno;
	
	//Construtor
	
	public PoligonoRegular(int nLados, double tamLado, double anguloInterno) {
		this.nLados = nLados;
		this.tamLado = tamLado;
		this.anguloInterno = anguloInterno;
		
	}
	
	//Métodos
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
	public int getnLados() {
		return nLados;
	}

	public void setnLados(int nLados) {
		this.nLados = nLados;
	}

	public double getTamLado() {
		return tamLado;
	}

	public void setTamLado(double tamLado) {
		this.tamLado = tamLado;
	}

	public double getAnguloInterno() {
		return anguloInterno;
	}

	public void setAnguloInterno(double anguloInterno) {
		this.anguloInterno = anguloInterno;
	}
	
		
}
