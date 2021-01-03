package application;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;
public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		CurrencyConverter.dolar = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		CurrencyConverter.quantity = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f ", CurrencyConverter.montante(CurrencyConverter.dolar, CurrencyConverter.quantity));
	
		sc.close();
	}

}
