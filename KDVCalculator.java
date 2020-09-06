package org.ahmetarabaci;

public class KDVCalculator {

	public static void main(String[] args) {
		double kdvRatio = 0.18;
		double price = 100.00;
		
		System.out.println("Price: " + price);
		System.out.println("KDV: " + kdvRatio * price);
		System.out.println("Price with KDV: " + (price * (1 + kdvRatio)));
	}
	
}


