package entites;

public class Banco {
	
	private int nConta;
	private String nome;
	private double valorDaConta;
	
	public Banco(int nConta, String nome) {
		this.nConta = nConta;
		this.nome = nome;
	}

	public Banco(int nConta, String nome, double depositoInicial) {
		this.nConta = nConta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getnConta() {
		return nConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDepositoInicial() {
		return valorDaConta;
	}
	
	public void deposito(double valor) {
		valor += valorDaConta;
	}
	
	public void saque(double valor) {
		valor -= valorDaConta + 5.0;
	}
	
	public String toString() {
		return nConta
				+ ", Nome: "
				+ nome
				+ ", "
				+ String.format("Valor: %.2f", valorDaConta);
	}
}
