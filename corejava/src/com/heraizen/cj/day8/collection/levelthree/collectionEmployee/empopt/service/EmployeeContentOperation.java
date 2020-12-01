package com.heraizen.cj.day8.collection.levelthree.collectionEmployee.empopt.service;

import com.heraizen.cj.day8.collection.levelthree.collectionEmployee.empopt.domain.Employee;

public interface EmployeeContentOperation {

	void  addEmployee(Employee emp);
	
	void deleteEmployee(int empno);
	
	void viewEmployee(int empno);
	
	void viewEmployees();
}
