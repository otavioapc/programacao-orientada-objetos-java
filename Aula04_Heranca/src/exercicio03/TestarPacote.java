package exercicio03;
public class TestarPacote {

	public static void main(String[] args) {

		Pacote pacote = new Pacote("Travessa Elzira Hartman", "CIC", "81310436", 10, 20);

		pacote.obterInformacoesBasicas();
		System.out.println("Custo: " + pacote.calcularCusto());
		System.out.println();

		SemPressa sp = new SemPressa("Rua Y", "Fazendinha", "89456123", 8, 50);

		sp.obterInformacoesBasicas();
		System.out.println("Custo: " + sp.calcularCusto());
		System.out.println();

		SuperVeloz sv = new SuperVeloz("Rua X", "Sítio Cercado", "84561234", 10, 20, 189745, 10);

		sv.obterInformacoesBasicas();
		System.out.println("Custo: " + sv.calcularCusto());

	}

}
