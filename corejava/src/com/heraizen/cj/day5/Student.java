package com.heraizen.cj.day5;

public class Student {
	private int id;
	private String name;
	private String address;
	static int count = 0;
	
	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		
		System.out.println("Student Name :- "+ name +"\nStudent ID :- "+ id +"\nStudent Address :- "+ address);
		System.out.println("\n-----------------------------------------------\n");
		
	}
	
	{
		count++;
	}
	

}
