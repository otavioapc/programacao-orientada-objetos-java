package zoologicodigital;
public class TestarZoo {

	public static void main(String[] args) {

		Arara arara = new Arara("Zé pequeno", 1.7, 4, 3);

		Leao leao = new Leao("Perigoso", 190, 7, 10);

		leao.obterInformacoesBasicas();
		System.out.println();
		arara.obterInformacoesBasicas();
		System.out.println();

		leao.comer("Carne");
		arara.comer("Alpiste");
		
		System.out.println();
		leao.brincar();
		System.out.println();
		arara.brincar();
		
		
	}

}
