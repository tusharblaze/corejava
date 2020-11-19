package com.heraizen.cj.day7.restrictiveObject;

public class DbConnection {

	static public int count = 0;
	
	public static DbConnection getObject() {
		
		if(count > 1) {
			return null;
		}else {
			return new DbConnection();
		}
		
	}

	private DbConnection() {
		count++;
		System.out.println(count);
	}
}
