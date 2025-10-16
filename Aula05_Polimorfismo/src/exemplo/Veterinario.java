package exemplo;
public class Veterinario {
	
	/*public void  cuidar(Sapo sapo) {
		sapo.mover();
	}
	
	public void cuidar(Passaro passaro) {
		passaro.mover();
	}
	
	public void cuidar(Peixe peixe) {
		peixe.mover();
	}*/
	
	public void cuidar(Animal animal) {
		animal.mover();
		
		if(animal instanceof Sapo) {
			Sapo sapo = (Sapo) animal;
			sapo.cacarMoscas();
		}
	}

}
