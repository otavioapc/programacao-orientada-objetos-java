package exercicio01;
public class ContaBancaria {

	// Atributos

	private int agencia;
	private int conta;
	private String nomeCorrentista;
	private String cpfCorrentista;
	private double saldo;

	// Construtor

	public ContaBancaria(int agencia, int conta, String nomeCorrentista, String cpfCorrentista, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.nomeCorrentista = nomeCorrentista;

		if (saldo < 0) {
			this.saldo = 0;
		} else {
			this.saldo = saldo;
		}

		if (cpfCorrentista.length() == 11) {
			this.cpfCorrentista = cpfCorrentista;
		} else {
			System.err.println("CPF inválido!");
			System.exit(0);
		}

	}

	// Métodos

	public double depositar(double valor) {

		return saldo = saldo + valor;
	}

	public double sacar(double valor) {

		if (valor <= saldo) {
			saldo = saldo - valor;
		} else {
			System.err.println("Operação inválida, saldo insuficiente!");
		}

		return saldo;
	}

	public void imprimirInfo() {
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("Nome: " + nomeCorrentista);
		System.out.println("CPF: " + cpfCorrentista);
		System.out.println("Saldo: R$ " + saldo);
		System.out.println();

	}

}