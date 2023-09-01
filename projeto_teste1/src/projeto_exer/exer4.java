package projeto_exer;

import java.util.Locale;
import java.util.Scanner;

public class exer4 {
	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double pi = 3.14159;	
			double raio;
			double area;
			
			raio = sc.nextDouble();
			area = (pi * raio * raio);
		
				System.out.printf("A= %.4f",area);
			sc.close();
	}
}
