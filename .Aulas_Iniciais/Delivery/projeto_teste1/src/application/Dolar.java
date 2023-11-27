package application;

import java.util.Locale;
import java.util.Scanner;

import entites.ConversaoDeDolar;

public class Dolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a cotacao do dolar ?");
		ConversaoDeDolar.dolar = sc.nextDouble();
		
		System.out.println("Quantos dolares voce pretende comprar ?");
		ConversaoDeDolar.quantidadeDoDolar = sc.nextDouble();
		
		ConversaoDeDolar.CalculoDolar();
		System.out.printf("A conversao em real foi: %.2f", ConversaoDeDolar.real);
		
		sc.close();
	}

}
