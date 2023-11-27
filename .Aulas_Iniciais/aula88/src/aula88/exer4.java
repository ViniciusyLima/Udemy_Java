package aula88;

import java.util.Locale;
import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0;i<vect.length;i++) {
			System.out.println("Digite um numero:");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0;i<vect.length;i++) {
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Valores: ");
		for (int i=0;i<vect.length;i++) {
			System.out.printf("%.1f, ", vect[i]);
		}
		System.out.printf("\nSoma: %.2f\n", soma);
		System.out.printf("Media: %.2f", media);
		
		sc.close();	
	}
}
