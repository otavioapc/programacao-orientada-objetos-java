package exercicio02;
public class TestarVeiculo {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo(1300, 180, 40000);
		
		v.obterInformacoesBasicas();
		System.out.println();
		
		CarroPasseio carro = new CarroPasseio(1600, 190, 70000, "Honda", "Preto");
		
		carro.obterInformacoesBasicas();
		System.out.println();
		
		Caminhao caminhao = new Caminhao(3000, 100, 100000, 3.5, 4.40, 14);
		
		caminhao.obterInformacoesBasicas();
		

	}

}
