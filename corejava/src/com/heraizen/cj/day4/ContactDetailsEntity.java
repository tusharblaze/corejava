package com.heraizen.cj.day4;

public class ContactDetailsEntity {
   public String fullName;
   public String ph_Number;
   public String address;
   
   ContactDetailsEntity(String name,String number,String address){
	   fullName = name;
	   ph_Number = number;
	   this.address = address;
   }
}
