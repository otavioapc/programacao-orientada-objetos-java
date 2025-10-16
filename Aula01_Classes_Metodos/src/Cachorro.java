
public class Cachorro {
	
	//Atributos (caracteristicas)
	
	private String cor = "Preto";
	private double tamanho = 10;
	private char sexo = 'M';
	private boolean racaIndeterminada = true;
		
	//Métodos (comportamento)
	
	public void mover(){
		System.out.println("correndo");
		
	}
	public void latir(){
		System.out.println("Vou dormir");
		
	}
	public void dormir(){
		System.out.println("Fazendo barulho");
		
	}
	
	public void imprimir() {
		System.out.println("cor: "+cor+"\n"+"tamanho: "+tamanho+"\n"+"raça: "+racaIndeterminada+"\n"+"sexo: "+sexo);
		
	}

}


