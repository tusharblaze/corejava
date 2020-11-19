package com.heraizen.cj.day6.iterator;

public class UserClient {

	public static void main(String[] args) {
		
		MyIterator it = UserList.getIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
