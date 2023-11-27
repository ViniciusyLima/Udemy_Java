package projeto_exer;

import java.util.Scanner;

public class exer15 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double total;
		int cod, quant;
		System.out.println("Codigo do produto:");
		cod = sc.nextInt();		
		
		System.out.println("Quantidade:");
		quant = sc.nextInt();		
		
		if (cod == 1) {
			total = quant * 4.0;
		}
		else if (cod == 2) {
			total = quant * 4.5;
		}
		else if (cod == 3) {
			total = quant * 5.0;
		}
		else if (cod == 4) {
			total = quant * 2.0;
		}
		else {
			total = quant * 1.5;
		};
		System.out.println("Total: R$ " + total);
		
		sc.close();
		
				
	}
}
