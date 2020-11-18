package com.heraizen.cj.day6;
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

class Car implements Game{

	@Override
	public void start() {
	
		System.out.println("Car Starts");
		
	}

	@Override
	public void stop() {
		System.out.println("Car Stops");
	}

	@Override
	public void play() {
		System.out.println("Car Running ....");
	}
	
	@Override
	public String toString() {
		return "Car Object Created ";
	}
	
}

class Bike implements Game{

	@Override
	public void start() {
	
		System.out.println("Bike Starts");
		
	}

	@Override
	public void stop() {
		System.out.println("Bike Stops");
	}

	@Override
	public void play() {
		System.out.println("Bike Running ....");
	}
	
	@Override
	public String toString() {
		return "Bike Object Created ";
	}
	
}
class Bicycle implements Game{

	@Override
	public void start() {
	
		System.out.println("Bicycle Starts");
		
	}

	@Override
	public void stop() {
		System.out.println("Bicycle Stops");
	}

	@Override
	public void play() {
		System.out.println("Bicycle Running ....");
	}
	
	@Override
	public String toString() {
		return "Bicycle Object Created ";
	}
	
}