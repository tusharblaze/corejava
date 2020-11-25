package com.heraizen.cj.day8.collection.leveltwo.viewNameAscending;

import java.util.HashSet;
import java.util.Set;


public class NameDetails {
	
	private static Set<String> nameList = new HashSet<String>();
	
	public static void addStates(String name){
		try {
			if(nameList.contains(name)) {
				System.out.println("Data is Already present in the List");
			}else {
				nameList.add(name);
			}
		}
		catch (NullPointerException e) {
			nameList.add(name);
		}
		
	}
	
	public static void viewStates(){
		
		nameList.stream().sorted((s1,s2)-> s2.compareTo(s1)).forEach(System.out::println);
		
	}

}
