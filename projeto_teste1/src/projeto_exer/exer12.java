package projeto_exer;

import java.util.Scanner;

public class exer12 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Qual o valor ?");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		}
		else{
			System.out.println("IMPAR");
		}
		sc.close();
				
	}
}
