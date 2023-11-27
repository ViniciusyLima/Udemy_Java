package projeto_exer;

	import java.util.Locale;
	import java.util.Scanner;
	
	public class exer25 {
		
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
				
				int alc = 0;
				int gas = 0;
				int die = 0;
				int x = sc.nextInt();
				
				while (x != 4) {
					if (x == 1) {
						alc = alc + 1;
					}
					else if ( x == 2) {
						gas = gas + 1;
					}
					else if (x == 0) {
						die = die + 1;
					}
				x = sc.nextInt();
				}
				
				System.out.printf("MUITO OBRIGADO!\nAlcool: %d\nGasolina: %d\nDiesel: %d", alc, gas, die);
		
			sc.close();
	}
}