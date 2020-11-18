package com.heraizen.cj.day6;

public class Controller {

	public static void main(String[] args) {
		
		RemoteControl controllerDvD = new DVD(10);
		RemoteControl controllerTv = new TV(30);
		System.out.println();
		if(controllerDvD.powerOnOff()) {
			System.out.println("DVD Switched on");
		}else {
			System.out.println("DVD Switched off");
		}
		controllerDvD.volumeDown(5);
		controllerDvD.volumeUp(10);
		
		System.out.println();
		
		if(controllerTv.powerOnOff()) {
			System.out.println("DVD Switched on");
		}else {
			System.out.println("DVD Switched off");
		}
		controllerTv.volumeDown(5);
		controllerTv.volumeUp(10);
		
		
	}

}
