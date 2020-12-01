package com.heraizen.cj.day8.collection.levelthree.collectionEmployee.empopt.main;

import java.util.Scanner;

import com.heraizen.cj.day8.collection.levelthree.collectionEmployee.empopt.domain.Employee;
import com.heraizen.cj.day8.collection.levelthree.collectionEmployee.empopt.service.EmployeeContainer;

public class EmployeeManager {

	public static void main(String[] args) {

		EmployeeContainer service = EmployeeContainer.getInstance();
		Scanner readVal = new Scanner(System.in);
		int employeeNo;
		String name;
		String jobDesc;

		while (true) {

			System.out.println("\n\t\t\t<====================== Employee Operations =========================>");
			System.out.printf(
					"\n\n1.Add Employee\t\t2.Show Employee Details\t\t3.Show Total Employee\t\t4.Delete Employee\t\t5.Exit");
			System.out.printf("\n\n@ Enter Your Choice = ");
			int choice = readVal.nextInt();

			switch (choice) {

			case 1:
				System.out.printf("\n@ Enter Employee Employee Id => ");
				employeeNo = readVal.nextInt();
				readVal.nextLine();
				System.out.printf("\n@ Enter Employee Name => ");
				name = readVal.nextLine();
				
				System.out.printf("\n@ Enter Employee Job Description => ");
				jobDesc = readVal.nextLine();
				service.addEmployee(new Employee(employeeNo, name, jobDesc));

				break;
			case 2:
				System.out.printf("\n@ Enter Employee Employee Id Whose Detail You Want to See => ");
				employeeNo = readVal.nextInt();
				service.viewEmployee(employeeNo);
				break;
			case 3:
				service.viewEmployees();
				break;
			case 4:
				System.out.printf("\n@ Enter Employee Employee Id Whose Detail You Want to Delete => ");
				employeeNo = readVal.nextInt();
				service.deleteEmployee(employeeNo);
				break;
			case 5:
				break;
			default: System.out.println("\n\t\t\t\tWrong Choice Selection ! Please Select Again....");
				break;
			}

			if (choice == 5) {
				System.out.println("\n\t\t\t\t\t*************** Terminating Application **************");
				break;
			}

		}

		readVal.close();

	}
}
