package com.heraizen.cj.day3;
import java.util.Scanner;

public class LexicoGraphicalOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        
      
        System.out.println(getSmallestAndLargest(s, k));
        
      
        String A=scan.next();
         
        StringBuffer sb = new StringBuffer(A);
        sb.reverse();
        System.out.println(sb+" "+A);
        if(sb.toString().equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        scan.close();

	}
	
	 public static String getSmallestAndLargest(String s, int k) {
	        String currStr = s.substring(0, k); 
	        String lexMin = currStr; 
	        String lexMax = currStr; 
	   
	        for (int i = k; i < s.length(); i++) { 
	            currStr = currStr.substring(1, k) + s.charAt(i);
	            System.out.println(currStr);
	            if (lexMax.compareTo(currStr) < 0)      
	                 lexMax = currStr; 
	            if (lexMin.compareTo(currStr) > 0) 
	                 lexMin = currStr;             
	        } 
	  
	        
	        return lexMin + "\n" + lexMax;
	    }

}


