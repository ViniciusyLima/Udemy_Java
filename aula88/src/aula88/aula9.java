package aula88;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class aula9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();

		
		System.out.println("Quantos funcionarios serao registrados?");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
		System.out.println();
		System.out.println("Funcionario #" + (i + 1));
		System.out.println("ID: ");
		Integer id = sc.nextInt();
		System.out.println("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Salario: ");
		Double salario = sc.nextDouble();
		
		Funcionario func = new Funcionario(id, nome, salario);
		
		list.add(func);
		}
		
		System.out.println("Qual o funcionario que ira receber aumento?");
		int idsalario = sc.nextInt();
		
		Integer pos = posicao(list, idsalario);
		if (pos == null) {
			System.out.println("Esse id nao existe!");
		}
		else {
			System.out.println("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			list.get(pos).InserirSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios:");
		for (Funcionario func : list) {
			System.out.println(func);
		}
		
		
		sc.close();
	}
	
	static Integer posicao(List<Funcionario> list, int id) {
		for (int i=0;i<list.size();i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
