package exercicio06;

public class Pedido {
	
	//Atributos
	
	private int codigo;
	private String descricao;
	private int quantidade;
	private double precoUnitario;
	private double totalFatura;
	
	//Construtor
	
	public Pedido(int codigo, String descricao, int quantidade, double precoUnitario) {
		
		if(quantidade > 0 && precoUnitario > 0) {
			this.codigo = codigo;
			this.descricao = descricao;
			this.quantidade = quantidade;
			this.precoUnitario = precoUnitario;
		}
		else {
			System.err.println("Erro!");
			System.exit(0);
			
		}
		
	}
	
	//Métodos
	
	public double calcularTotalFatura() {
		
		totalFatura = quantidade * precoUnitario;
		
		return totalFatura;
	}
	
	public void imprimirInformacoes() {
		System.out.println("Código: "+codigo);
		System.out.println("Descrição: "+descricao);
		System.out.println("Quantidade: "+quantidade);
		System.out.println("Preço "+precoUnitario);
		System.out.println("Fatura total: "+totalFatura);
				
	}
	
	

}
