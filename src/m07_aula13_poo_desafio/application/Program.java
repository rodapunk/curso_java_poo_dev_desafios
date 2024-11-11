package m07_aula13_poo_desafio.application;

import java.util.Locale;
import java.util.Scanner;

import m07_aula13_poo_desafio.entities.Bill;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		do {
		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);
		} while (!(bill.gender == 'M' || bill.gender == 'F'));
		
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println("\nRELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
		
		if (bill.cover() > 0.0)
			System.out.printf("Couvert = R$ %.2f%n", bill.cover());
		else
			System.out.println("Isento de Couvert");
		
		System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());
		System.out.printf("\nValor a pagar = R$ %.2f", bill.total());
		
		sc.close();
	}
}