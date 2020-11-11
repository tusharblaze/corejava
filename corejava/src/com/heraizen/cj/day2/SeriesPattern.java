
package com.heraizen.cj.day2;
import java.util.Scanner;

public class SeriesPattern {

	public static void main(String[] args) {
		
		Scanner readVal = new Scanner(System.in);
		System.out.println("Enter the upper bound:");
		int value = readVal.nextInt();
        
		for(int i =1 ;i <= value; i++) {
			for (int j=1; j<=i;j++) {
				System.out.printf("%d ",j);
			}
			
			if(i >= 1) {
				int k =i;
				while(k != 0) {
					System.out.printf("%d ",k);
					k--;
				}
			}
			System.out.printf("\n");
		}
		
		readVal.close();

	}

}
