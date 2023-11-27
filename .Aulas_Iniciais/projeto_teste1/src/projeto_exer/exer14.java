package projeto_exer;

import java.util.Scanner;

public class exer14 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, f, d;
		System.out.println("Qual a hora inicial ?");
		i = sc.nextInt();
		
		System.out.println("Qual a hora final ?");
		f = sc.nextInt();
		
		if (i < f) {
			d = f - i;
		}
		else {
			d = 24 - i + f;
		}
		
		System.out.println("O JOGO DUROU " + d + "HORAS(S)");
		sc.close();
		
				
	}
}
