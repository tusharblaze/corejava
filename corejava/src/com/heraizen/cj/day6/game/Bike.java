package com.heraizen.cj.day6.game;
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