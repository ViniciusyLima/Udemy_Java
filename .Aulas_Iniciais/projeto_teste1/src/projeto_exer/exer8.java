package projeto_exer;
import java.util.Locale;
import java.util.Scanner;

public class exer8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
			float A, B, C, tri, cir, trap, quad, reta;
			
			A = sc.nextFloat();
			B = sc.nextFloat();
			C = sc.nextFloat();
			
			tri = (A*C)/2;
			cir = (float)(3.14159 * C * C);
			trap = (float)((A + B) / 2.0 * C);
			quad = B * B;
			reta = A * B;
			
			System.out.printf("TRIANGULO: %.3f%n", tri);
			System.out.printf("CIRCULO: %.3f%n", cir);
			System.out.printf("TRAPEZIO: %.3f%n", trap);
			System.out.printf("QUADRADO: %.3f%n", quad);
			System.out.printf("RETANGULO: %.3f%n", reta);
		sc.close();
	}
}
