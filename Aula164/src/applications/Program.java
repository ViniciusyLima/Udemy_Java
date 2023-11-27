package applications;

import java.util.Locale;
import java.util.Scanner;

import entites.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + "date:");
			System.out.println("Rectangle or Circle (r/c)? ");
		}
		
		sc.close();
	}

}
