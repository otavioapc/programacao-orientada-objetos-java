package exercicio09;
import exercicio09.Ponto2D;

public class DistanciaPonto {
	
	//Metodo
	
	public double calcularDistancia(Ponto2D a, Ponto2D b) {		
		
		return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
	};
	
}


