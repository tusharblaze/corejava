package com.heraizen.cj.day5;

public class SearchString {

	public static void main(String[] args) {
		
		String str ="miami,laksham,java,milli,narayana";
		String searchString = "narayana";
		
		String[] arr = str.split(",");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(searchString)) {
				System.out.println("Found at position "+i);
			}
		}

	}

}
