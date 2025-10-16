package exercicio06;
public class TestarPedido {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(34, "Alicate", 9, 9.12);
		
		pedido.calcularTotalFatura();
		
		pedido.imprimirInformacoes();

	}

}
