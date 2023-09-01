package entites;

public class ConversaoDeDolar {

	public static double dolar;
	public static double quantidadeDoDolar;
	public static double real;
	public static final double IOF = 6;
	
	public static double CalculoDolar() {
		real = dolar * quantidadeDoDolar;
		return real += (real * IOF) / 100;
	}
}
