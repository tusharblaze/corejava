package com.heraizen.cj.day6.game;
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