package util;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	public static double dolar;
	public static double quantity;
	
	public static double montante (double dolar, double quantity) {
		return dolar*quantity*IOF;
	}
}
