package exercicio01;

public class Empresa {
	
	//Atributos
	
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;
	private int qtdeFunc;
	
	//Construtor
	
	public Empresa() {
		
	}
	
	public Empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone, int qtdeFunc) {
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.qtdeFunc = qtdeFunc;
		
	}
	
	//Métodos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getQtdeFunc() {
		return qtdeFunc;
	}

	public void setQtdeFunc(int qtdeFunc) {
		this.qtdeFunc = qtdeFunc;
	}
	
	public void imprimirInformacoesBasicas() {
		
		System.out.println("Nome: "+nome);
		System.out.println("Estado: "+estado);
		System.out.println("Cidade: "+cidade);
		System.out.println("Endereço: "+endereco);
		System.out.println("CEP: "+cep);
		System.out.println("Telefone: "+telefone);
		System.out.println("Quantidade de Funcionários: "+qtdeFunc);
		System.out.println();
		
	}
	
	
}
