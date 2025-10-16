//5.	Utilize o diagrama abaixo para resolver as questões:
//a.	Crie as classes solicitadas.
//b.	Faça o relacionamento de herança entre elas.
//c.	Crie o método obterInformacoesBasicas para cada classe. Este método imprime TODOS os atributos da classe (inclusive da classe mãe).
//d.	Todas as classes devem possuir construtores para inicializar seus atributos.
//e.	Teste sua aplicação. OBS: o método valorINSS é calculado aplicando-se 11% sobre o salário do empregado e o total de vendas é calculado multiplicando-se a quantidade de vendas X valor venda.
package exercicio05;

public class Pessoa {
	
	//Atributos 
	
	private String nome;
	private int idade;
	private char sexo;
	
	//Construtor
	
//	public Pessoa() {
//		
//	}
	
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	//Métodos
	
	public void obterInformacoesBasicas() {
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Sexo: "+sexo);
		
	}

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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
	
}
