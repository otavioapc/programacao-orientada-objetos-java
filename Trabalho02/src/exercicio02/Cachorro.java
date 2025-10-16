package exercicio02;
public class Cachorro extends Mamifero{
	
	//Construtor
	
	public Cachorro(String nome, int idade, float peso, float velocidade) {
		super(nome, idade, peso, velocidade);
	}
	
	//Métodos
	
	public void correr() {
		
		System.out.println("Au!Au!Au!Au!Au!Au!Au!Au!Au!");
		
	}

}
