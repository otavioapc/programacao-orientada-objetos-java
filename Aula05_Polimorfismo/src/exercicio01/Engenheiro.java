package exercicio01;

public class Engenheiro {
	
	//Atributos
	
	private String nome;
	
	//Construtor
	
	public Engenheiro(String nome) {
		this.nome = nome;
	}
	
	//Métodos
	
	public void calcular(PoligonoRegular pr) {
		
		System.out.println("Área: "+pr.calcularArea());
		System.out.println("Perímetro: "+pr.calcularPerimetro());
		System.out.println("Ângulo: "+pr.getAnguloInterno());
		
	}

}
