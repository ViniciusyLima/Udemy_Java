package projeto_exer;

import java.util.Scanner;

public class exer13 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		System.out.println("Qual o valor ?");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.println("Sao Multiplos");
		}
		else{
			System.out.println("Nao Sao Multiplos");
		}
		sc.close();
				
	}
}
