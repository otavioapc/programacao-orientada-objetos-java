package exercicio02;

public class ChamarLampada {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada(true);
		

		lamp.mostrarEstado();
		lamp.apagarLampada();
		
		lamp.mostrarEstado();
		
		lamp.acenderLampada();
		lamp.mostrarEstado();
		
		lamp.apagarLampada();
		lamp.mostrarEstado();
	}

}
