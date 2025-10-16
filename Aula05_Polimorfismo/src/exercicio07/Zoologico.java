package exercicio07;
public class Zoologico {
		
	public static void main(String[] args) {
		
		Animal[] jaula = new Animal[6];
		
		jaula[0] = new Cachorro("Mel", 9);
		jaula[1] = new Unicornio("Pinto", 300);
		jaula[2] = new Panda("Pedro", 8);
		jaula[3] = new Cachorro("Capitão", 11);
		jaula[4] = new Unicornio("Amorosa", 900);
		jaula[5] = new Panda("Gordão", 3);
		
		for(int i = 0; i < jaula.length; i++) {
			
			Animal temp = jaula[i];
			temp.informacaoAnimal();
			temp.correr();
			temp.emitirSom();
			
			if(temp instanceof Cachorro) {
				Cachorro c = (Cachorro) temp;
				c.protegerCasa();
				System.out.println();
				
			}
			
			if(temp instanceof Panda) {
				Panda p = (Panda) temp;
				p.dormirInfinitamente();
				System.out.println();
				
			}
			
			if(temp instanceof Unicornio) {
				Unicornio u = (Unicornio) temp;
				u.galopar();
				System.out.println();
				
			}
			
		}
		
	}

}
