package projeto_exer;

	import java.util.Locale;
	import java.util.Scanner;
	
	public class exer23 {
		
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			
			while (x != 2002) {
				if ( x != 2002) {
					System.out.println("Senha Incorreta!");
				}
				x = sc.nextInt();
			}
			
			System.out.println("Senha Correta!");
			
		sc.close();
	}
}