package com.heraizen.cj.day7.restrictiveObject;

public class DbConnectionManage {

	public static void main(String[] args) {
		DbConnection db;
		for(int i=0; i < 2; i++) {
			db = DbConnection.getObject();
		
			if(DbConnection.count > 0) {
				throw new IllegalObjectCreation();
			}else {
				System.out.println("Object is created "+(i+1)+" time .");
			}
		}

	}

}
