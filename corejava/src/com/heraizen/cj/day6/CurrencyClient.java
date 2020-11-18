package com.heraizen.cj.day6;
import java.util.Scanner;

public class CurrencyClient {

	public static void main(String[] args) {
		
		Scanner readVal = new Scanner(System.in);
		
		System.out.printf("Enter the country Name = ");
		
	    String countryName = readVal.next();
	    Currency currencyCode = CurrencyContainer.getCurrency(countryName);
	    System.out.printf("The currency code of country %s  is %s ",countryName,currencyCode.getCurrency());
	    
	    readVal.close();
		
	}

}
