package exercicio09;
public class TestarDistanciaPonto {

	public static void main(String[] args) {
		
		Ponto2D a = new Ponto2D();
		a.setX(5);
		a.setY(6);
		
		Ponto2D b = new Ponto2D();
		
		b.setX(8);
		b.setY(5);
		
		DistanciaPonto calculo = new DistanciaPonto();
		
		double printCalculo = calculo.calcularDistancia(a,b);
		
		System.out.println(printCalculo);
	}

}
