package projeto_exer;

import java.util.Scanner;

public class exer3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		x = sc.nextInt();
		y = sc.nextInt();
		int resultado = (x + y);
		System.out.println("Soma: " + resultado);
		sc.close();
	}
}
