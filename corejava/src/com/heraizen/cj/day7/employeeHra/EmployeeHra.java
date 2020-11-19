package com.heraizen.cj.day7.employeeHra;

public class EmployeeHra implements Employee {

	int empId;
	String empName;
	String designation;
	double basic;
	double hra;

	EmployeeHra(int empId, String empName, String designation, double basic, double hra) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
		this.hra = hra;
	}

	@Override
	public void printDET() {
		System.out.println("The employee Detail is");
		System.out.println("----------------------------------------------------");
		System.out.println("Employee Id :" + this.empId);
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Employee Designation: " + this.designation);
		System.out.println("Employee basic: " + this.basic);
	}

	@Override
	public void calculateHRA() {
		double hraBasedonBasic = this.hra / 100 * this.basic;
		System.out.println("hra based on salary "+hraBasedonBasic);
	}
}
