/*
 *  39.
		1 2 3 4 5
		5 1 2 3 4
		4 5 1 2 3
		3 4 5 1 2
		2 3 4 5 1 
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class AlternatePattern {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		int n = readVal.nextInt();
		int m =n;
		for(int i=1;i<=n;i++) {
			
			for(int k=0,o=n;k<n-m;k++,o--) {
				System.out.print(o+" ");	
			}
			for(int j=1;j<=m;j++) {
				System.out.print(j+" ");
			}
			
			m--;
			System.out.print("\n");
		}

	}

}
