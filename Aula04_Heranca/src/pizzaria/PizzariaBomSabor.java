package pizzaria;
public class PizzariaBomSabor {
	
	public static void main(String[] args) {
		
		PizzaBacon pbacon = new PizzaBacon("Mussarela, Bacon, Queijo",35,30);
		
//		pbacon.setIngredientes("Mussarela, Bacon, Queijo");
//		pbacon.setTempoForno(20);
//		pbacon.setPreco(30);
		pbacon.detalharPizza();
		pbacon.setPreco(30);
		pbacon.detalharPizza();
		
		PizzaCalabresa pcalab = new PizzaCalabresa("Mussarela, Calabresa, Queijo", 35, 20);
		
//		pcalab.setIngredientes("Mussarela, Calabresa, Queijo");
//		pcalab.setPreco(35);
//		pcalab.setTempoForno(30);
		pcalab.detalharPizza();
		
	}

}
