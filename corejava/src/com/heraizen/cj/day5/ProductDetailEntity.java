package com.heraizen.cj.day5;

public class ProductDetailEntity {
	
	private int pid;
	private String pname;
	private float price;
	
	
    ProductDetailEntity(int pid ,String pname,float price) {
		this.pid = pid;
		this.pname = pname;
		this.price= price;
	}
	
	public void display() {
		
		System.out.println("Product Name : "+pname);
		System.out.println("Product ID : "+pid);
		System.out.println("Product Price : "+price);
		System.out.println("---------------------------------------------\n");
		
	}

}
