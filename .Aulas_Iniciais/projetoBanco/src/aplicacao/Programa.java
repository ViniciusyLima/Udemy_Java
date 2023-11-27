package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Conta;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.println("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		System.out.println("Entre com o nome da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Tem um deposito inicial? (s/n)");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Entre com o valor inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		}
		else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println();
		System.out.println("Informacoes da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Entre com o valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Entre com o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);
		
		
		sc.close();
	}
}
