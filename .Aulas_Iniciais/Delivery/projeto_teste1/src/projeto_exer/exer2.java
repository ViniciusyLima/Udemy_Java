package projeto_exer;

import java.util.Scanner;

public class exer2 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Voce digitou: " + x + ", tem: " + y + " anos e seu bebe tem: " + z);
	sc.close();
	}
}
