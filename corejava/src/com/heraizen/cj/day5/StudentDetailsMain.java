package com.heraizen.cj.day5;

public class StudentDetailsMain {

	public static void main(String[] args) {
		Student student1 = new Student(1001,"Tushar","Ranchi coloney, Dhanbad, Jharkhand");
		Student student2 = new Student(1002,"Dadu","telhari, bandamunda, Kolkata");
		Student student3 = new Student(1003,"Pawan","Jp coloney, Motihari, Bihar");
		Student student4 = new Student(1004,"Ritesh","Jp coloney, Motihari, Bihar");
		Student student5 = new Student(1005,"Abhisekh","Nirmanpur, Ranchi, Jharkhand");
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
		
		System.out.println("Total Number of Object Created = " +Student.count );

	}

}
