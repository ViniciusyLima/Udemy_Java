package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import mode.services.BrazilTaxService;
import mode.services.RentalServices;
import model.entitites.CarRental;
import model.entitites.Vehicle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o preco por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preco por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalServices rentalService = new RentalServices(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("Fatura:");
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imporsto: " + String.format("%.2f",cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
		
		
		
		sc.close();
	}
}
