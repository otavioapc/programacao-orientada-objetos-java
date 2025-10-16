package exercicio01;
public class Restaurante extends Empresa {

	// Atributos

	private String tipoDeComida;
	private double precoMedio;

	// Construtor

	public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone, int qtdeFunc, String tipoDeComida, double precoMedio) {
		super(nome, endereco, cidade, estado, cep, telefone, qtdeFunc);
		this.tipoDeComida = tipoDeComida;
		this.precoMedio = precoMedio;

	}
	
	//Métodos
	
	public void imprimirInformacoesBasicas() {
		super.imprimirInformacoesBasicas();
		System.out.println("Tipo de Comida: "+tipoDeComida);
		System.out.println("Preço Médio: "+precoMedio);
		
	}

	public String getTipoDeComida() {
		return tipoDeComida;
	}

	public void setTipoDeComida(String tipoDeComida) {
		this.tipoDeComida = tipoDeComida;
	}

	public double getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(double precoMedio) {
		this.precoMedio = precoMedio;
	}
		

}
