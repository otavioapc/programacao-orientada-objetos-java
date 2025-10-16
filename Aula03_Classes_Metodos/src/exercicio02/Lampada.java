package exercicio02;

public class Lampada {
	
	//Crie uma classe Lampada com um atributo que irá indicar se está acesa ou apagada. 
	//Crie três métodos: apagar (apaga a lâmpada), acender (acende a lâmpada) e mostrarEstado (imprime o estado da lâmpada). 
	//Crie uma classe para testar esta classe
	
	//Atributo
	
	private boolean sinalizador;
	
	//Construtor
	
	public Lampada(boolean sinalizador) {
		this.sinalizador = sinalizador;
		
	}
	
	//Métodos

	public void apagarLampada() {
		sinalizador = false;
	}
	
	public void acenderLampada() {
		sinalizador = true;
	}
	
	public void mostrarEstado() {
		
		if(sinalizador) {
			System.out.println("Lâmpada acesa!");
		}		
		else{
			System.out.println("Lâmpada apagada!");
		}
		
	}

}
