/*
 *  32.
		A B C
		D E F
		G H I

 */
package com.heraizen.cj.day2;

public class AlphabateSeries {

	public static void main(String[] args) {
		
       int value;
       for(int i =1 ;i <= 9; i++) {
    	    value = 64;
			value += i;
		    System.out.printf("%s ",(char)value);
			if(i % 3 == 0) {
				System.out.printf("\n");
			}
			
		}
	}

}
