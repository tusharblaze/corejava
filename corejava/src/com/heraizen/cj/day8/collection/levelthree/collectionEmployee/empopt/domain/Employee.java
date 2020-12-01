package com.heraizen.cj.day8.collection.levelthree.collectionEmployee.empopt.domain;

public class Employee {
	private int empno;
    
	public Employee(int empno, String ename, String job) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}

	public long getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	private String ename;
	private String job;

	public void showInfo() {
		
		System.out.printf("\n\t\t\t%-10d %-20s %-15s\n", empno, ename, job);

	}
}
