package com.heraizen.cj.day8.collection.levelthree.memberslist.memberservice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.heraizen.cj.day8.collection.levelthree.memberslist.memberdomain.Member;
import com.heraizen.cj.day8.collection.levelthree.memberslist.memberidskel.MemberIdGenerator;

public class MemeberContainer {
	
	private static MemberIdGenerator obj;
	private static List<Member> memberlist = new ArrayList<>();
	
	public static MemberIdGenerator getInstance() {
		if (obj == null) {
			synchronized (MemberIdGenerator.class) {
				if (obj == null) {
					obj = new MemberIdGenerator();
				}
			}
		}
		return obj;
	}
	
	public static void addMemeber (String mid,String name,String city,String country) {
		memberlist.add(new Member(mid, name, city, country));
		System.out.printf("\n\n%-15s %-23s %-15s %-15s \n","Member ID","Member Name","City Name","Country Name");
		memberlist.forEach(s -> s.display());
		System.out.println("\n\nMember Added Successfuly in the List");
		
	}
	public static void deleteMember(String id) {
		if(memberlist.isEmpty()) {
			System.out.println("\n\n\t\tMember List is Empty !! Deletion operation can't be done");
		}else {
			
			if(memberlist.stream().anyMatch(s->s.getMid().equals(id))) {
				memberlist.removeIf(s -> s.getMid().equals(id));
				System.out.println("\n\nMember Deleted Successfuly in the List");
				System.out.printf("\n\n%-15s %-23s %-15s %-15s \n","Member ID","Member Name","City Name","Country Name");
				memberlist.forEach(s -> s.display());
				System.out.println("\n\nMember Added Successfuly in the List");
			}else {
				System.out.println("\n\n\t\tThis Member is not Present in List !! Wrong Member ID Inputed .. Try Again");
			}
			
		}
		
	}
	public static void searchById(String id) {
		
		if(memberlist.isEmpty()) {
			System.out.println("\n\n\t\tMember List is Empty !! Search By ID operation can't be done");
		}else {
			
			if(memberlist.stream().anyMatch(s->s.getMid().equals(id))) {
				System.out.printf("\n\n%-23s %-15s %-15s %-15s\n","Member Name","City Name","Country Name","Member ID");
				memberlist.forEach(s->{
					if(s.getMid().equalsIgnoreCase(id)) {
						System.out.printf("\n%-23s %-15s %-15s %-15s",s.getName(),s.getCity(),s.getCountry(),s.getMid());
					}
				});
			}else {
				System.out.println("\n\n\t\tThis Member is not Present in List !! Wrong Member ID Inputed .. Try Again");
			}
			
		}
		
	
	}
	public static void searchMember(int id,String name) {
		
		
		if(memberlist.isEmpty()) {
			System.out.println("\n\n\t\tMember List is Empty !! Search by ID and Name operation can't be done");
		}else {
			
			if(memberlist.stream().anyMatch(s-> Integer.parseInt(s.getMid().split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))")[1]) == id)) {
				System.out.printf("\n\n%-23s %-15s %-15s %-15s\n","Member Name","City Name","Country Name","Member ID");
				memberlist.forEach(s->{
					if(Integer.parseInt(s.getMid().split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))")[1]) == id && s.getName().equalsIgnoreCase(name)) {
						System.out.printf("\n%-23s %-15s %-15s %-15s\n",s.getName(),s.getCity(),s.getCountry(),s.getMid());
					}
				});
			}else {
				System.out.println("\n\n\t\tThis Member is not Present in List !! Wrong Member ID or Name Inputed .. Try Again");
			}
			
		}
		
	}
	public static void displaySortingOrder(String s) {
		
		if(s.equalsIgnoreCase("desc")) {
			 Collections.sort(memberlist,(s1,s2) -> s2.getName().toLowerCase().compareTo(s1.getName().toLowerCase()));
				
				System.out.printf("\n\n%-15s %-23s %-15s %-15s \n","Member ID","Member Name","City Name","Country Name");
				memberlist.stream().forEach(e->e.display());
		}
		
		if(s.equalsIgnoreCase("aesc")) {
			Collections.sort(memberlist,(s1,s2) -> s1.getName().toLowerCase().compareTo(s2.getName().toLowerCase()));
			
			System.out.printf("\n\n%-15s %-23s %-15s %-15s \n","Member ID","Member Name","City Name","Country Name");
			memberlist.stream().forEach(e->e.display());
		}
		
		
		
		
       
		
	}
}
