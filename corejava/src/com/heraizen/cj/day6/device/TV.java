package com.heraizen.cj.day6.device;

class TV implements RemoteControl{
    
	final int MAX_SOUND;
	final int MIN_SOUND;
	boolean powerOnOff;
	int currentVol;
	
	TV(int volume){
		MAX_SOUND = 50;
		MIN_SOUND = 10;
		powerOnOff = false;
		currentVol = volume;
		System.out.println("Current volume level in TV is "+currentVol);
	}
	
	@Override
	public boolean powerOnOff() {
		powerOnOff = !powerOnOff;
		return powerOnOff;
	}

	@Override
	public int volumeUp(int increment) {
		if((currentVol + increment) > MAX_SOUND) {
			System.out.println("Volume Goes Max");
			currentVol = MAX_SOUND;
		}else {
			currentVol += increment;
		}
		System.out.println("Current volume level in TV is "+currentVol);
		return currentVol;
	}

	@Override
	public int volumeDown(int decrement) {
		if((currentVol >= decrement ?currentVol - decrement: decrement - currentVol) < MIN_SOUND) {
			System.out.println("Volume Goes Minimum");
			currentVol = MIN_SOUND;
		}else {
			currentVol = currentVol >= decrement ?currentVol - decrement: decrement - currentVol;
		}
		System.out.println("Current volume level in TV is "+currentVol);
		return currentVol;
	}

	@Override
	public void mute() {
       System.out.println("X Mute X");
	}
	
}