package cachorro;

public class Cachorro {
	
	//Atributos (caracteristicas)
	
		private String cor;
		private double tamanho;
		private char sexo; //O char usa aspas simples('')
		private boolean racaIndeterminada;
		
		//Construtor ("Pseudo-Método")
		
		public Cachorro(String cor, double tamanho) {
			
			setTamanho(tamanho);
			setCor(cor);
			
		}
		
			
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

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public double getTamanho() {
			return tamanho;
		}

		public void setTamanho(double tamanho) {
			
			if(tamanho > 0) {
				
			this.tamanho = tamanho;
			
			}
			else {
				System.err.println("Erro!");
				
				
			}
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public boolean isRacaIndeterminada() {
			return racaIndeterminada;
		}

		public void setRacaIndeterminada(boolean racaIndeterminada) {
			this.racaIndeterminada = racaIndeterminada;
		}

}
