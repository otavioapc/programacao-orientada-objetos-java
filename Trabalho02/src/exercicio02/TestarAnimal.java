package exercicio02;
public class TestarAnimal {

	public static void main(String[] args) {
		
		//Teste 01
		
		Animal animal = new Animal ("Gavião", 5, 1.4f);
		
		animal.exibirInformacoes();
		animal.fazerSom();
		System.out.println();
		
		Mamifero mamifero = new Mamifero("Vaca", 6, 510f, 40);
		
		mamifero.exibirInformacoes();
		mamifero.fazerSom();
		System.out.println();
		
		Ave ave = new Ave("Pomba", 2, 2.0f, 34);
		
		ave.exibirInformacoes();
		ave.fazerSom();
		System.out.println();
		
		Reptil reptil = new Reptil("Dragão-de-Komodo", 6, 160f, 35);
		
		reptil.exibirInformacoes();
		reptil.fazerSom();
		System.out.println();
		
		//Teste 02
		
		Cachorro cachorro = new Cachorro("Mel", 5, 10f, 48f);
		
		cachorro.exibirInformacoes();
		cachorro.fazerSom();
		cachorro.correr();
		System.out.println();
		
		Papagaio papagaio = new Papagaio("Zequinha", 3, 2.0f, 52);
		
		papagaio.exibirInformacoes();
		papagaio.fazerSom();
		papagaio.voar();
		System.out.println();
		
		Cobra cobra = new Cobra("Medusa", 7, 10, 25);
		
		cobra.exibirInformacoes();
		cobra.fazerSom();
		cobra.rastejar();

	}

}
