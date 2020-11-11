/*
 * 14.   Write a program to accept the marks scored in three subjects; determine the sum and average of the entered marks. Grade is awarded based on following criteria.

If average is < 35 -- “C”; >35 and <60 -- “B”; Otherwise -- “A”

Expected output:

Enter the marks scored in 1st subject:
40
Enter the marks scored in 2nd subject:
60
Enter the marks scored in 3rd subject:
80

Total marks: 180
Average is: 60.0
Grade: “B
 */
package com.heraizen.cj.day2;
import java.util.Scanner;

public class GradeMarksEvaluation {

	public static void main(String[] args) {
		
		Scanner readVal =new Scanner(System.in);
		
		System.out.println("Enter the marks scored in 1st subject:");
		int markSubject1 = readVal.nextInt();
		
		System.out.println("Enter the marks scored in 2nd subject:");
		int markSubject2 = readVal.nextInt();
		
		System.out.println("Enter the marks scored in 3rd subject:");
		int markSubject3 = readVal.nextInt();
		
		int totalMarks = markSubject1 + markSubject2 + markSubject3;
		float averageMarks = totalMarks / 3;
		
		if(averageMarks < 35) {
			System.out.printf("Total Marks : %d\nAverage is: %.2f\nGrade : C",totalMarks,averageMarks);
		}else if(averageMarks >= 35 && averageMarks <= 60) {
			System.out.printf("Total Marks : %d\nAverage is: %.2f\nGrade : B",totalMarks,averageMarks);
		}else {
			System.out.printf("Total Marks : %d\nAverage is: %.2f\nGrade : A",totalMarks,averageMarks);
		}
		
		readVal.close();
		
	}

}
