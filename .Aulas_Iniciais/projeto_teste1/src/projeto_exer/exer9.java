package projeto_exer;

import java.util.Locale;
import java.util.Scanner;

public class exer9 {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			double horas, minutos, segundos;
			
			horas = sc.nextDouble();
			minutos = sc.nextDouble();
			segundos = sc.nextDouble();
			
			minutos = horas*60 + minutos;
			segundos = minutos*60 + segundos;
			
			System.out.printf("Total em segundos: %.2f", segundos);

		sc.close();
	}
}
