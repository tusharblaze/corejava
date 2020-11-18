package com.heraizen.cj.day5;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		String[] subjects = new String[5];
		int[] marks = new int[5];
		System.out.printf("\nEnter The name of the Student => ");
		String name = readVal.nextLine();
		System.out.println("\nEnter the 5 subject name of the student with marks ");
		for(int i=0; i< subjects.length;i++) {
			System.out.printf("\n Enter Subject%d name => ",i+1);
			subjects[i] = readVal.next();
		
			System.out.printf("\n Enter %s Marks => ",subjects[i]);
			marks[i] = readVal.nextInt();
		}
		
		StudentMarksCalculate stud1 = new StudentMarksCalculate(name,subjects,marks);
		
		stud1.display();
		
		readVal.close();

	}

}
