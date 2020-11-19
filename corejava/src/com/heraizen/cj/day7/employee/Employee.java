package com.heraizen.cj.day7.employee;

public class Employee {

	int empNumber;
	String name;
	float exp;

	Employee(int empNumber, String name, float exp){
		this.empNumber = empNumber;
		this.name = name;
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		return "( Name --> "+name +" |ID --> "+empNumber+" |Experiance --> "+ exp + " ) ";
		
	}
	
}
