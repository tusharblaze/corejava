package com.heraizen.cj.day6.game;
import java.util.concurrent.ThreadLocalRandom;

public class GameManager {

	public static void main(String[] args) {
		
		Game[] gamesArr = new Game[10];
		int[] randomVal = new int[gamesArr.length];
		
		for(int i=0; i < randomVal.length; i++) {
			randomVal[i] = ThreadLocalRandom.current().nextInt(1, 4);
			
		}

		for(int j=0; j < gamesArr.length; j++) {
			if(randomVal[j] == 1) {
				gamesArr[j] = new Car();
			}
			if(randomVal[j] == 2) {
				gamesArr[j] = new Bike();
			}
			if(randomVal[j] == 3) {
				gamesArr[j] = new Bicycle();
			}
		}
		
		for(Game val: gamesArr) {
			System.out.println(val);
			val.start();
			val.play();
			val.stop();
			System.out.println("\n--------------------------\n");
		}

	}

}



