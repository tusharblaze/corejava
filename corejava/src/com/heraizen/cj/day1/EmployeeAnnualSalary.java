/*
 * 3.Write a program to accept the following details of an employee: empno, name and monthly salary; calculate the yearly salary and display the result.

	Expected output:

	Enter the empno:
	1001
	Enter the employee name:
	Ramana
	Enter the monthly salary:
	25000
	Hi Ramana! Your employee id is 1001, monthly salary is Rs 25,000 and yearly salary is Rs 300,000.
 */
package com.heraizen.cj.day1;
import java.util.*;

public class EmployeeAnnualSalary {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the empno:");
		int empno = scr.nextInt();
		System.out.println("Enter the employee name:");
		scr.nextLine();
		String empName = scr.nextLine();
		System.out.println("Enter the monthly salary:");
		int empMonthlySalary = scr.nextInt();
		int empAnnualSalary = empMonthlySalary * 12;
		System.out.printf("Hi %s! Your employee id is %d, monthly salary is Rs %,d and yearly salary is Rs %,d.",
							empName,empno,empMonthlySalary,empAnnualSalary);

	}

}
