package exercicio07;
public class Cachorro extends Animal{
	
	//Construtor
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	//Métodos
	
	public void protegerCasa() {
		
		System.out.println("Protegendo a casa!");
		
	}

	@Override
	public void correr() {
		System.out.println("Correndo saltitando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Au Au Au Au");
		
	}

}
