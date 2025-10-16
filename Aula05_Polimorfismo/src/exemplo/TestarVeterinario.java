package exemplo;
import exemplo.Veterinario;

public class TestarVeterinario {
	
	public static void main(String[] args) {
		
		Veterinario teste = new Veterinario();
		
		Passaro ave = new Passaro();
		Sapo sapo = new Sapo();
		Peixe peixe = new Peixe();
		
		
		teste.cuidar(sapo);
		
		
				
	}

}
