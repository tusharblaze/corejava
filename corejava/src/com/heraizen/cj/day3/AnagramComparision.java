package com.heraizen.cj.day3;
import java.util.Scanner;

public class AnagramComparision {

	public static void main(String[] args) {
		 	Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

	static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length())
        return false;
         
    int count = 0;
  
    for(int i = 0; i < a.length(); i++)
    {
        count = count + a.charAt(i);
    }
 
    
    for(int i = 0; i < b.length(); i++)
    {
        count = count - b.charAt(i);
    }
 
    return (count == 0);
    }
}
