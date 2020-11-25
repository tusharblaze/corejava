package com.heraizen.cj.day8.collection.leveltwo.prime;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class PrimeNumbers {
	
	public static void generatePrimes(int N) {
		
		Vector<Integer> listPrime = new Vector<>();
		
		while(listPrime.size() != N) {
			int num =ThreadLocalRandom.current().nextInt(1,100);
			boolean flag =false;
			for(int i = 2; i<= num / 2; i++) {
				if(num % i == 0) {
					flag =true;
					break;
				}
			}
			if(!flag) {
				listPrime.add(num);
			}
			
		}
		
		showPrimes(listPrime);
	}
	
	public static void showPrimes(Vector<Integer> listPrime){
		
		listPrime.stream().forEach(System.out::println);
		
	}

}
