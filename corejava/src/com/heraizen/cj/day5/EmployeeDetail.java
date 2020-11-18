package com.heraizen.cj.day5;

public class EmployeeDetail {

	int empid;
	String empName;
	float empSalary;
	
	public EmployeeDetail(int id, String name) {
		empid = id;
		empName = name;
		empSalary = 20000.0f;
	}
	
	public EmployeeDetail(int id, String name,float salary) {
		empid = id;
		empName = name;
		empSalary = salary;
	}
	
	public void display() {
		System.out.println("Employee Details \n");
		System.out.println("\nEmployee ID = " + empid);
		System.out.println("\nEmployee Name = " + empName);
		System.out.println("\nEmployee Salary = " + empSalary);
		System.out.println("-------------------------------------\n");
	}
}
