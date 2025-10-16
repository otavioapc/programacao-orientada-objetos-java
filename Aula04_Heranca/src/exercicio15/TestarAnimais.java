//18.	Crie uma classe TestarAnimais possua um método main para testar as classes criadas:
//●	Crie um objeto camelo do tipo Mamífero. Atribua dados a este objeto e imprima suas informações.
//●	Crie um objeto tubarao do tipo Peixe. Atribua dados a este objeto e imprima suas informações.
//●	Crie um objeto urso do tipo Mamífero. Atribua dados a este objeto e imprima suas informações.
package exercicio15;

public class TestarAnimais {
	
	public static void main(String[] args) {
		
		Mamifero camelo = new Mamifero("Camelo", 3.45, 4, "Marrom", "Deserto", 65, "Vegetais");
		
		camelo.relatorioAnimal();
		System.out.println();
		
		Peixe tubarao = new Peixe("Baiacu", 40, 0, "Verde", "Água salgada", 45, "É capaz de inflar");
		
		tubarao.relatorioAnimal();
		System.out.println();
		
		Mamifero urso = new Mamifero("Urso", 3, 4, "Marrom", "Floresta", 48, "Peixes");
		
		urso.relatorioAnimal();
		
	}

}
