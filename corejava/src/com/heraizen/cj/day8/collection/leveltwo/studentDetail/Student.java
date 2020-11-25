package com.heraizen.cj.day8.collection.leveltwo.studentDetail;

public class Student {

	private static int user_id = 10001;
	private String name;
	private String email;
	private String course;
	
	public Student(String name, String email, String course) {
		super();
		user_id++;
		this.name = name;
		this.email = email;
		this.course = course;
	}

	public  int getUser_id() {
		return user_id;
	}

	public  void setUser_id(int user_id) {
		Student.user_id = user_id++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
