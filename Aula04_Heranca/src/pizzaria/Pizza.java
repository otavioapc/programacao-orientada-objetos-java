package pizzaria;

public class Pizza {
	
	private String ingredientes;
	private double tempoForno;
	private double preco;
	
	
	public Pizza(String ingredientes, double tempoForno, double preco) {

		setIngredientes(ingredientes);
		setTempoForno(tempoForno);
		setPreco(preco);
		
	}
	
	public void detalharPizza() {
		
		System.out.println("Ingredientes: "+ingredientes);
		System.out.println("Tempo Forno: "+tempoForno);
		System.out.println("Preço: "+preco);
		System.out.println();
		
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public double getTempoForno() {
		return tempoForno;
	}

	public void setTempoForno(double tempoForno) {
		this.tempoForno = tempoForno;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
