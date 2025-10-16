package exercicio04;

public class Aluno {
	
	//Crie a classe Aluno com os seguintes atributos: nome, matrícula, media, nota01 e nota02. 
	//Essa classe deverá ter um construtor que irá inicializar os atributos nome e matrícula e os métodos setters para os atributos notas (entre 0 e 10). 
	//Você deve criar um método que irá calcular a média aritmética das notas e outro método para informar se o(a) aluno(a) está reprovado ou não. 
	//Considerar média de aprovação igual a 7. Teste a classe.

	// Atributos

	private String nome;
	private int matricula;
	private double media;
	private double nota01;
	private double nota02;

	// Construtor

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;

	}

	// Métodos

	public void setNota01(double nota01) {

		if (nota01 >= 0 && nota01 <= 10) {
			this.nota01 = nota01;

		} else {
			System.err.println("Erro!");
			System.exit(0);

		}
	}

	public void setNota02(double nota02) {

		if (nota02 >= 0 && nota02 <= 10) {
			this.nota02 = nota02;
		} else {
			System.err.println("Erro!");
			System.exit(0);
		}
	}

	public double mediaNotas() {

		media = (nota01 + nota02) / 2;

		return media;
	}

	public void estadoAluno() {

		if (media >= 7) {
			System.out.println("Aprovado!");

		}
		if (media < 7) {
			System.out.println("Reprovado!");

		}

	}

}
