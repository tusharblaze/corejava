package com.heraizen.cj.day5;

public class ProductInstrumentMain {

	public static void main(String[] args) {
		
	 ProductIntrument laptop = new ProductIntrument(100, "Sony", 8500);
	 ProductIntrument desktop = new ProductIntrument(100, "Sony", 35000);
	 System.out.println("Before Swapping price is ");
     System.out.println("laptop Price : "+laptop.price);
     System.out.println("Desktop Price : "+desktop.price);
     System.out.println("\n------------------------------------\n");
	 swap(laptop,desktop);
     System.out.println("After Swapping price is ");
     System.out.println("laptop Price : "+laptop.price);
     System.out.println("Desktop Price : "+desktop.price);
	}
	
	public static void swap(ProductIntrument laptop, ProductIntrument desktop) {
		
		int tempPrice =laptop.price;
		laptop.price = desktop.price;
		desktop.price = tempPrice;
	}

}
