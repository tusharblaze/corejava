package com.heraizen.cj.day5;

public class CalculateSumMain {

	public static void main(String[] args) {
		
		CalculateSum sum1 = new CalculateSum();
	
		System.out.println("The Sum of 10 and 12 is : "+sum1.sum(10,12));
		System.out.println("The Sum of 100, 15 and 212 is : "+sum1.sum(100,15,212));
		System.out.println("The Sum of 21, 123, 635 and 132 is : "+sum1.sum(21,123,635,132));
		System.out.println("The Sum of 52, 2123, 32, 22 and 12 is : "+sum1.sum(52,2123,32,22,12));

	}

}
