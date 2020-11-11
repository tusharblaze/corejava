/*
 *  36.
	@ @ @ @
	@       @
	@ @ @ @
	@       @
	@       @
 */
package com.heraizen.cj.day2;

public class RpatternSeries {

	public static void main(String[] args) {
		
		for(int i =1 ;i <= 5; i++) {
			for (int j=1; j<=5;j++) {
				if((i == 1 || i == 3) && j < 5) {
					System.out.print("@ ");
				}
				if((i == 2 || i >3) && (j==1 || j==5)) {
					System.out.print("@");
				}else if((i == 2 || i >3) &&(j!=1 || j!=5)) {
					System.out.print("  ");
				}
			}
			System.out.printf("\n");
		}
		
	}

}
