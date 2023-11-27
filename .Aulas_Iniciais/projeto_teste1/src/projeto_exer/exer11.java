package projeto_exer;

import java.util.Scanner;

public class exer11 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Qual o valor ?");
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("NEGATIVO");
		}
		else if (x >= 0) {
			System.out.println("NAO NEGATIVO");
		}
		sc.close();
				
	}
}
