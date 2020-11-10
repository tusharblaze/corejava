/*
 * 2.Write a program to accept the weight of 3 persons, calculate the total weight, determine the average weight and display these details.

     Expected output:

     Enter the weight of the first person:
     55.5
     Enter the weight of the second person:
     45.4
     Enter the weight of the third person:
     65.6
     The sum of weight of the 3 persons is 166.5 Kgs and the average weight is 55.5 Kgs 
 */
package com.heraizen.cj.day1;
import java.util.*;

public class WeightDetail {

	public static void main(String[] args) {
	 Scanner src = new Scanner(System.in);
	 System.out.println("Enter the weight of the first person:");
	 float person1 = src.nextFloat();
	 System.out.println("Enter the weight of the second person:");
	 float person2 = src.nextFloat();
	 System.out.println("Enter the weight of the third person:");
	 float person3 = src.nextFloat();
	 float totalWeight = person1 + person2 + person3;
	 float averageWeight = totalWeight / 3;
	 System.out.printf("The sum of weight of the 3 persons is %5.1f Kgs and the average weight is %5.1f Kgs",
			 			 totalWeight,averageWeight);
	 
	}

}
