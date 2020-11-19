package com.heraizen.cj.day6.game;

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