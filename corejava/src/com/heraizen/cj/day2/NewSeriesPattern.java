/*
 *  40.
		1 2 3 4
		5 6 7
		8 9
		10
 */
package com.heraizen.cj.day2;

public class NewSeriesPattern {

	public static void main(String[] args) {

		int value = 4;
		int valueBound = value;
        int showValue =1;
		for(int i =1 ;i <= value; i++) {
			for (int j=1; j<=valueBound;j++) {
				System.out.printf("%d ",showValue);
				showValue++ ;
			}
			System.out.printf("\n");
			valueBound--;
		}
		
		

	}

}
