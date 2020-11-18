package com.heraizen.cj.day5;

public class VowelAndConsonent {

	public static void main(String[] args) {
		
		String str = new String("Tushar");
		int countConsonent =0;
		int countVowel=0;
		
		for(int i=0;i< str.length(); i++) {
			if(str.charAt(i) == 'a'|| str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
					str.charAt(i) == 'i'|| str.charAt(i) == 'I' ||str.charAt(i) == 'o'|| str.charAt(i) == 'O' ||
					str.charAt(i) == 'u'||str.charAt(i) == 'U') {
				countVowel++;
			}else {
				countConsonent++;
			}
		}
		
		System.out.printf("The number of vowel and consonent is %s is %d and %d ",str,countVowel,countConsonent);

	}

}
