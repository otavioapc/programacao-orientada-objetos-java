package exercicio04;
import java.util.Scanner;

public class TestarAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Otávio Augusto", 34);
	
		aluno.setNota01(7);
		aluno.setNota02(3);
		
		System.out.println("A média é: "+aluno.mediaNotas());
		
		aluno.estadoAluno();

	}

}
