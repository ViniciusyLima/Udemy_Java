package projeto_exer;

	import java.util.Locale;
	import java.util.Scanner;
	
	public class exer28 {
		
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
				
			int n = sc.nextInt();
			int in = 0, out = 0;
			
			for (int i=0; i<n; i++) {
				int x = sc.nextInt();
				if (x >= 10 && x <= 20) {
					in = in + 1;
				}
				else {
					out = out + 1;
				}
			}
			System.out.println(in + " in\n" + out + " out");
			sc.close();
	}
}