package com.heraizen.cj.day8.collection.leveltwo.studentDetail;
import java.util.HashMap;
import java.util.Map;

public class StudentOperation {
	
	static Map<Integer,Student> studentDetails = new HashMap<>();

	public static void addStudent(Student s) {
		studentDetails.put(s.getUser_id(), s);
	}
	
	public static void viewStudents( ) {
		System.out.printf("%-8s %-10s %-10s %-10s","USER ID","NAME","EMAIL","COURSE");
		studentDetails.forEach((key,value)-> System.out.printf("\n%-8d %-10s %-10s %-10s",key,value.getName(),value.getEmail(),value.getCourse()));
		
	}
	
	public static void viewStudent(Integer id) {
		System.out.printf("Student Details\n\n");
		studentDetails.get(id);
		
	}
}
