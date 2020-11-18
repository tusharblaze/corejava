package com.heraizen.cj.day5;

public class StudentMarksCalculate {
	
	String name;
	String[] sub;
	int[] marks;
	int totalMarks;
	
	StudentMarksCalculate(String name,String[] sub, int[] marks){
		this.name = name;
		this.sub = sub;
		this.marks = marks;
		totalMarks = 0;
	}
	
	public void display() {
		
		System.out.println("\t\t\t<========== Student Details ==========>\n");
		System.out.printf("\n\t\t > Student Name : %s",name);
		System.out.printf("\n\n\t\t @ Student Subject and Marks ");
		for(int i=0 ; i < sub.length; i++) {
			System.out.printf("\n\n\t\t > Student Having %d Marks in %s subject",marks[i],sub[i]);
		}
		calSum(marks);
		System.out.printf("\n\t\t ( Student having total Marks of %d out of 500 )",totalMarks);
		
	}
	
	public void calSum(int[] a) {
		for(int i=0 ; i < a.length; i++) {
			totalMarks += a[i];
		} 
	}

}
