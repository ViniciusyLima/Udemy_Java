package aula88;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluguel;

public class exer6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10];
		
		System.out.println("Quantos quartos serao alugados?");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Aluguel #" + 1 + ":");
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int nQuarto = sc.nextInt();
			
			vect[nQuarto] = new Aluguel(nome, email);
		}
		System.out.println();
		System.out.println("Quartos Ocupados:");
		for (int i=0;i<10;i++) {
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();	
	}
}
