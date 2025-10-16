package exercicio03;

public class Pacote {

	// Atributos

	private String endereco;
	private String bairro;
	private String cep;
	private double peso;
	private double precoKg;

	// Construtor

	public Pacote() {

	}

	public Pacote(String endereco, String bairro, String cep, double peso, double precoKg) {
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		if (peso < 0 || precoKg < 0) {
			System.err.println("Erro!");
			System.exit(0);

		} else {
			this.peso = peso;
			this.precoKg = precoKg;

		}
	}

	// Métodos

	public double calcularCusto() {

		return peso * precoKg;
	}

	public void obterInformacoesBasicas() {
		System.out.println("Endereço: " + endereco);
		System.out.println("Bairro: " + bairro);
		System.out.println("CEP: " + cep);
		System.out.println("Peso: " + peso);
		System.out.println("Preço KG: " + precoKg);

	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecoKg() {
		return precoKg;
	}

	public void setPrecoKg(double precoKg) {
		this.precoKg = precoKg;
	}

}
