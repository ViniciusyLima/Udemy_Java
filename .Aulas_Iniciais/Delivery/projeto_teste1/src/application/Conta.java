package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Banco;

public class Conta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double depositoInicial = 0;
		
		System.out.println("Entre com o numero da conta: ");
		int nConta = sc.nextInt();
	
		System.out.println("Entre com o nome da conta: ");
		String nome = sc.nextLine();
		
		System.out.println("Existe um deposito incial (s/n) ?");
		String resposta = sc.nextLine();
		
		
		
		
		sc.close();
	}

}
