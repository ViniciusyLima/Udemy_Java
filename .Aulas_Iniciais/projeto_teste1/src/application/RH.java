package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Funcionario;

public class RH {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = sc.nextLine();
		funcionario.salario = sc.nextDouble();
		funcionario.imposto = sc.nextDouble();
		
		funcionario.imposto();
		
		System.out.println("Funcionario: " + funcionario);
		
		System.out.println("Qual a porcentagem sobre o salario? ");
		double porcentagem = sc.nextDouble();
		
		funcionario.porcentagem(porcentagem);
		
		System.out.println("Dados Atualizados: " + funcionario);
		
		sc.close();
	}

}
