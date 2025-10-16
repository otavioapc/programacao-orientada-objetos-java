package exercicio03;
public class SuperVeloz extends Pacote {

	// Atributos

	private int codRastreamento;
	private double taxa;

	// Construtor

	public SuperVeloz(String endereco, String bairro, String cep, double peso, double precoKg, int codRastreamento,
			double taxa) {
		super(endereco, bairro, cep, peso, precoKg);
		this.codRastreamento = codRastreamento;

		if (taxa < 0) {
			System.err.println("Erro!");
			System.exit(0);

		} else {
			this.taxa = taxa;
		}

	}

	// Métodos

	public double calcularCusto() {

		return taxa + super.calcularCusto();

	}

	public void obterInformacoesBasicas() {
		super.obterInformacoesBasicas();
		System.out.println("Código Rastreamento: " + codRastreamento);
		System.out.println("Taxa: " + taxa);

	}

	public int getCodRastreamento() {
		return codRastreamento;
	}

	public void setCodRastreamento(int codRastreamento) {
		this.codRastreamento = codRastreamento;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
