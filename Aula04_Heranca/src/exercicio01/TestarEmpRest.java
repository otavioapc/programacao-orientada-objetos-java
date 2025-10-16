package exercicio01;
public class TestarEmpRest {

	public static void main(String[] args) {
		
		Empresa emp = new Empresa("Amazon", "Rua Y", "Curitiba", "Paraná", "81456789", "+55 (41)965487531", 600);
		
		emp.imprimirInformacoesBasicas();
		
		Restaurante res = new Restaurante("Amazon", "Rua Y", "Curitiba", "Paraná", "81456789", "+55 (42)965487531", 600, "Carne", 30);
		
		res.setNome("Churrascaria");
		res.imprimirInformacoesBasicas();

	}

}
