package exercicio02;
public class ControleRemoto {

	// Atributos

	private String marca;
	private int canalAtual;
	private int potenciaVolume;
	
	//Construtor

	public ControleRemoto(String marca, int canalAtual, int potenciaVolume) {
		this.marca = marca;
		this.setCanalAtual(canalAtual);
		this.setPotenciaVolume(potenciaVolume);

	}
	
	//Métodos

	public void aumentarVolume() {

		if (potenciaVolume < 100) {
			potenciaVolume++;
		}

	}

	public void diminuirVolume() {

		if (potenciaVolume > 0) {
			potenciaVolume--;
		}

	}

	public void trocarCanal(int canal01) {
		if (canal01 >= 1 && canal01 <= 15) {
			this.canalAtual = canal01;
		} else {
			System.err.println("Canal Inválido");
		}

	}

	public void imprimirInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Volume: " + potenciaVolume);
		System.out.println("Canal: " + canalAtual);

	}

	public void setCanalAtual(int canalAtual) {
		if (canalAtual >= 1 && canalAtual <= 15) {
			this.canalAtual = canalAtual;
		}

	}

	public void setPotenciaVolume(int potenciaVolume) {
		if (potenciaVolume >= 0 && potenciaVolume <= 100) {
			this.potenciaVolume = potenciaVolume;
		}

	}

}
