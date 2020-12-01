package com.heraizen.cj.day8.collection.levelthree.collectionEmployee.empopt.service;

import java.util.HashSet;
import java.util.Set;

import com.heraizen.cj.day8.collection.levelthree.collectionEmployee.empopt.domain.Employee;

public class EmployeeContainer implements EmployeeContentOperation {

	private static EmployeeContainer obj;
	private Set<Employee> employeeList = new HashSet<>();

	public static EmployeeContainer getInstance() {
		if (obj == null) {
			synchronized (EmployeeContainer.class) {
				if (obj == null) {
					obj = new EmployeeContainer();
				}
			}
		}
		return obj;
	}

	@Override
	public void addEmployee(Employee emp) {

		try {
			if (employeeList != null) {
				if (!employeeList.stream().anyMatch(s -> (s.getEmpno() == emp.getEmpno()
						&& s.getEname().equals(emp.getEname()) && s.getJob().equals(emp.getJob())))) {
					employeeList.add(emp);
					System.out.println("\n\t\t\tSuccessfuly Added");
				} else {
					System.out.println("\n\t\t\tWarning !!! Employee Already present in the List");
				}
			}
		} catch (Exception e) {
			employeeList.add(emp);
			System.out.println("\n\t\t\t\t\t\tSuccessfuly Added");
		}

	}

	@Override
	public void deleteEmployee(int empno) {

		boolean emp = employeeList.stream().anyMatch(s -> s.getEmpno() == empno);

		if (emp) {
			employeeList.removeIf(s -> s.getEmpno() == empno);
			System.out.println("\n\n\t\t\t\t\t Deleted Succesfuly");
		} else {
			System.out.println("\n\t\t\tXXXXXXXXXXX Data Not Found XXXXXXXXXXXX");
		}

	}

	@Override
	public void viewEmployee(int empno) {
		if (employeeList.stream().anyMatch(s -> s.getEmpno() == empno)) {
			System.out.printf("\n\t\t\t%-10s %-20s %-15s\n", "ID", "Employee Name", "Job Description");
			employeeList.stream().filter(s -> s.getEmpno() == empno).forEach(s -> s.showInfo());
		} else {
			System.out.println("\n\t\t\tXXXXXXXXXXX Data Not Found XXXXXXXXXXXX");
		}

	}

	@Override
	public void viewEmployees() {
		if(!employeeList.isEmpty()) {
			System.out.printf("\n\t\t\t%-10s %-20s %-15s\n", "ID", "Employee Name", "Job Description");
			employeeList.stream().forEach(s -> s.showInfo());
		}else {
			System.out.println("\n\t\t\tXXXXXXXXXXX Data Not Found XXXXXXXXXXXX");
		}

	}

}
