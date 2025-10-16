package exercicio07;

public abstract class Animal {
	
	//Atributos
	
	private String nome;
	private int idade;
	
	//Construtor
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	
	//Método
	
	public abstract void correr();
	
	public abstract void emitirSom();
	
	public void informacaoAnimal() {
		
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		
	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}	

}
