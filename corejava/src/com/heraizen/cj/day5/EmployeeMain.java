package com.heraizen.cj.day5;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeDetail emp1 = new EmployeeDetail(1101, "Tushar Anand");
		EmployeeDetail emp2 = new EmployeeDetail(1102, "Pawan pandey",42000.25f);
        
		emp1.display();
		emp2.display();
	}

}
