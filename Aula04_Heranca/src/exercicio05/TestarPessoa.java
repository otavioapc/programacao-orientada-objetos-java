package exercicio05;
public class TestarPessoa {
	
	public static void main(String[] args) {
		
		Vendedor vend = new Vendedor("Otávio", 24, 'M', 3000, "MHS15", 15, 1000);
				
		vend.obterInformacoesBasicas();
		System.out.println("Total Venda: R$"+vend.totalVendas());		
		System.out.println();
		
		Gerente geren = new Gerente("Cachorrão", 35, 'M', 5000, "TKC87", "Batatinha");
		
		geren.obterInformacoesBasicas();
		System.out.println();
		
		Cliente cliente = new Cliente("Pinduca", 19, 'M', 58000, 2005);
		
		cliente.obterInformacoesBasicas();
		System.out.println();
		
		Empregado emp = new Empregado("Rosangela", 34, 'F', 3000, "PCH10");
		
		emp.obterInformacoesBasicas();
		System.out.println("Valor INSS: R$"+emp.valorINSS());
		
		
	}

}
