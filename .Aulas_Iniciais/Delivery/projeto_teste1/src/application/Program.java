package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um produto: ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Preco: ");
		double preco = sc.nextDouble();
		
		System.out.println("Quantidade no estoque: ");
		int quantidade = sc.nextInt();
		
		Product product = new Product(nome, preco, quantidade);
		
		product.setNome("Computador");
		System.out.println("Nome atualizado: " + product.getNome());
		
		product.setPreco(1200.00);
		System.out.println("Nome atualizado: " + product.getPreco());
		
		System.out.println();
		System.out.println("Nome do produto: " + product);
		
		System.out.println();
		System.out.println("Entre com o numero de produto no estoque: ");
		quantidade = sc.nextInt();
		product.AdicionarProdutos(quantidade);
		
		System.out.println();
		System.out.println("Estoque atualizado: " + product);
		
		System.out.println();
		System.out.println("Entre com o numero de produto para serem removidos do estoque: ");
		quantidade = sc.nextInt();
		product.RemoverProdutos(quantidade);
		
		System.out.println();
		System.out.println("Estoque atualizado: " + product);
				
		sc.close();
	}

}
