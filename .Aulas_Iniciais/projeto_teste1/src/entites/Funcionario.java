package entites;

public class Funcionario {

	public String nome;
	public double salario;
	public double imposto;
	
	public void imposto() {
		salario -= imposto;
	}
	
	
	public void porcentagem(double porcentagem) {
		salario += (salario+imposto) * porcentagem / 100.0;
	}
	
	
	public String toString() {
		return nome
				+ ", $ "
				+ String.format("%.2f", salario);
	}
}
