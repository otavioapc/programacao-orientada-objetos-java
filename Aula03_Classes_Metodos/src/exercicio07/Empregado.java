package exercicio07;

public class Empregado {
	
	//Atributos
	
	private String primeiroNome;
	private String segundoNome;
	private double salarioMensal;
	
	//Construtor
	
	public Empregado(String primeiroNome, String segundoNome, double salario) {
		
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		
		if(salario <= 0) {
			this.salarioMensal = 1800;			
		}
		else {
			this.salarioMensal = salario;
		}
		
	}
	
	//Métodos
	
	public double aumentarSalario(double x) {
		
		salarioMensal = salarioMensal + (salarioMensal * (x/100));
		
		return salarioMensal;
	}
	
	public void informacoesEmpregado() {
		System.out.println("Nome: "+primeiroNome);
		System.out.println("Sobrenome: "+segundoNome);
		System.out.println("Salário: "+salarioMensal);
		System.out.println("");
		
	}

}
