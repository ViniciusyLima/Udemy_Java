package projeto_exer;
import java.util.Locale;
import java.util.Scanner;

public class exer6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			
			int n, horas;
			double valor, salario;
			
			n = sc.nextInt();
			horas = sc.nextInt();
			valor = sc.nextDouble();
			salario = (horas * valor);
			
			System.out.printf(" NUMERO = %d\n Salario = U$ %.2f", n, salario);
			System.out.println();
			
		sc.close();
	}
}
