/*
 *  34.
		19 0 0
		0 19 0
		0 0 19
 */
package com.heraizen.cj.day2;

public class DigonalMatrix {

	public static void main(String[] args) {
	
    
		for(int i =1 ;i <= 3; i++) {
			for (int j=1; j<=3;j++) {
				if( i != j) {
					System.out.printf("%d ",0);
				}else {
					System.out.printf("%d ",19);
				}
				
			}
			System.out.printf("\n");
		}
		
		
		
	}

}
