package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Aluno;

public class Nota {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		aluno.NotaFinal();
		
		
		sc.close();

	}

}
