package com.heraizen.cj.day8.collection.leveltwo.studentDetail;
import java.util.Scanner;

public class StudentDetailMain {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			
			System.out.printf("\nEnter the Name => ");
			String name = readVal.nextLine();
			
			System.out.printf("\nEnter the Email => ");
			String email = readVal.nextLine();
			
			System.out.printf("\nEnter the Course => ");
			String course = readVal.nextLine();
			
			StudentOperation.addStudent(new Student(name, email, course));
			
			System.out.println("\n\t\t\tAdded Successfully");
		}
		StudentOperation.viewStudents();
		StudentOperation.viewStudent(10002);
		readVal.close();
	}

}
