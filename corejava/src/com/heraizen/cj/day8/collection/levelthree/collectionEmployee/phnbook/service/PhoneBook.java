package com.heraizen.cj.day8.collection.levelthree.collectionEmployee.phnbook.service;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
	Map<String, String> map = new HashMap<>();

	public void addDetails(String phno,String name){
	  map.put(phno,name);
	  System.out.println("\n\n\t\t\t*********** ADDED SUCCESSFULY *********");
	}

	public String getName(String phno) {
		return map.get(phno);
	}
}
