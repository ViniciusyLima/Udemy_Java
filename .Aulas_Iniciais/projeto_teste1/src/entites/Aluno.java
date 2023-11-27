package entites;

public class Aluno {

	public double n1;
	public double n2;
	public double n3;
	
	public double NotaFinal() {
		double nf = n1 + n2 + n3;
		if (nf > 60.0) {
			System.out.printf("Grade Final: %.2f\nPASSOU!", nf);
		}
		else {
			System.out.printf("Grade Final: %.2f\nREPROVOU!\n", nf);
			nf = 60.0 - nf;
			System.out.printf("Faltou: %.2f pontos", nf);
		}
		return nf;
	}
}
