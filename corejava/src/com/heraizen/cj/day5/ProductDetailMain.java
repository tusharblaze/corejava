package com.heraizen.cj.day5;

public class ProductDetailMain {

	public static void main(String[] args) {
		
		ProductDetailEntity[] prodctDetails= new ProductDetailEntity[10];
		
		System.out.println("Creating Product detail dummy object");
		
		for(int i=0; i < prodctDetails.length; i++) {
			prodctDetails[i] = new ProductDetailEntity(1000+(i+1),"dabar"+(i+1),(200.00f +(i+1))*(i+1));
		}
		
		System.out.println("Dummy Product Dtails\n");
		
		for(int i=0; i < prodctDetails.length; i++) {
			prodctDetails[i].display();
		}

	}

}
