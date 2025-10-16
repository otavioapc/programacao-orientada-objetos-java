package exercicio07;
public class Unicornio extends Animal{
	
	//Construtor
	
	public Unicornio(String nome, int idade) {
		super(nome, idade);
	}
	
	//Métodos
	
	public void galopar() {
		
		System.out.println("Galopando!");
		
	}

	@Override
	public void correr() {
		System.out.println("Unicornio flutuando!");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de um unicórnio!");
		
	}

}
