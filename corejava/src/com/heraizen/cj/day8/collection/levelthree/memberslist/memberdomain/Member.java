package com.heraizen.cj.day8.collection.levelthree.memberslist.memberdomain;

public class Member {
	private String mid;
	private String name;
	private String city;
	private String country;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Member(String mid, String name, String city, String country) {
		super();
		this.mid = mid;
		this.name = name;
		this.city = city;
		this.country = country;
	}
	
	public void display() {
		
		System.out.printf("\n%-15s %-23s %-15s %-15s",mid,name,city,country);
		
	}

}
