package projeto_exer;

import java.util.Scanner;

public class exer16 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double ent;
		ent = sc.nextDouble();
		
		if (ent >= 00.01 && ent <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}
		else if (ent >= 25.01 && ent <= 50.00) {
			System.out.println("Intervalo [25,50]");
		}
		else if ( ent >= 50.01 && ent <= 75.00) {
			System.out.println("Intervalo [50,75]");
		}
		else if (ent >= 75.01 && ent <= 100.00) {
			System.out.println("Intervalo [75,100]");
		}
		else if (ent <= 0 || ent >= 100.01) {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}
}

/*import java.util.Locale;
import java.util.Scanner;

public class exer16 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
	}
}*/