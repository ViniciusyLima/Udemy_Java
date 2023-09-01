package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Retangulo;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Qual a largura e a altura ?");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		double area = retangulo.area();
		double perimetro = retangulo.perimetro();
		double diagonal = retangulo.diagonal();
		
		System.out.printf("AREA: %.2f\n", area);
		System.out.printf("PERIMETRO: %.2f\n", perimetro);
		System.out.printf("DIAGONAL: %.2f\n", diagonal);
		
		sc.close();
	}

}
