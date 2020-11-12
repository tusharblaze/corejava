package com.heraizen.cj.day3;
import java.util.Scanner;

public class SplitScreens {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        s = s.trim();
	        String[] ch = s.split("[^\\s*|! ,?._'@]+");
	        
	        System.out.println(ch.length);
	        for(int i=0;i< ch.length;i++ ){
	            System.out.println(ch[i]);
	        }
	        scan.close();

	}

}
