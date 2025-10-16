package exercicio07;
public class TestarEmpregado {

	public static void main(String[] args) {
		
		Empregado emp1 = new Empregado("Otávio", "Augusto",-1800);
		
		Empregado emp2 = new Empregado("Adilson", "Ribeiro", 1200);
								
		emp1.aumentarSalario(7);
		emp1.informacoesEmpregado();
				
		emp2.aumentarSalario(5);
		emp2.informacoesEmpregado();
		
	}

}
