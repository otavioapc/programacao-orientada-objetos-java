package exercicio07;
public class Panda extends Animal{
	
	//Construtor
	
	public Panda(String nome, int idade) {
		super(nome, idade);
	}
	
	//Métodos
	
	public void dormirInfinitamente() {
		
		System.out.println("Dormindo....");
		
	}

	@Override
	public void correr() {
		System.out.println("Rolando ladeira baixo!");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Rugido de um Panda!");
		
	}

}
