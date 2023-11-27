package projeto_exer;

	import java.util.Locale;
	import java.util.Scanner;
	
	public class exer30 {
		
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
				
			int n = sc.nextInt();
			
			for (int i=0; i<n; i++) {
				
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				if (y == 0) {
					System.out.println("Divisao Impossivel");
				}
				else {
					double soma = (double) x / y;
					System.out.println(soma);
				}
			}
			
			sc.close();
	}
}