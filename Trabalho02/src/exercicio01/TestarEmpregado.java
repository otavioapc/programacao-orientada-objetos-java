package exercicio01;
public class TestarEmpregado {

	public static void main(String[] args) {

		Empregado[] empregados = new Empregado[6];
		double salarios = 0;

		EmpregadoHorista emphoris1 = new EmpregadoHorista("João", 2000, 100, 30);
		EmpregadoHorista emphoris2 = new EmpregadoHorista("Carlos", 200, 120, 15);

		EmpregadoComissionario empcom1 = new EmpregadoComissionario("Maria", 2100, 10000, 15);
		EmpregadoComissionario empcom2 = new EmpregadoComissionario("Márcia", 1900, 9000, 10);

		EmpregadoAssalariado empass1 = new EmpregadoAssalariado("Antônio", 3100);
		EmpregadoAssalariado empass2 = new EmpregadoAssalariado("Fernanda", 3300);

		empregados[0] = emphoris1;
		empregados[1] = emphoris2;
		empregados[2] = empcom1;
		empregados[3] = empcom2;
		empregados[4] = empass1;
		empregados[5] = empass2;
		
		//Teste 1

		for (int i = 0; i < empregados.length; i++) {

			empregados[i].exibirDetalhes();
			System.out.println();

		}
		
		//Teste 2

		for (int i = 0; i < empregados.length; i++) {

			if (empregados[i] instanceof EmpregadoHorista) {

				EmpregadoHorista emp = (EmpregadoHorista) empregados[i];
				System.out.println("Empregado Horista");
				salarios = salarios + emp.calcularSalario();
				emp.exibirDetalhes();
				System.out.println();

			}

			if (empregados[i] instanceof EmpregadoAssalariado) {

				EmpregadoAssalariado emp = (EmpregadoAssalariado) empregados[i];
				System.out.println("Empregado Assalariado");
				salarios = salarios + emp.calcularSalario();
				emp.exibirDetalhes();
				System.out.println();

			}

			if (empregados[i] instanceof EmpregadoComissionario) {

				EmpregadoComissionario emp = (EmpregadoComissionario) empregados[i];
				System.out.println("Empregado Comissionário");
				salarios = salarios + emp.calcularSalario();
				emp.exibirDetalhes();
				System.out.println();

			}

		}

		System.out.println("Salário total a ser pago: R$" + salarios);

	}

}
