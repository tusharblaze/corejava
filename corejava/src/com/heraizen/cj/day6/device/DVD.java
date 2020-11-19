package com.heraizen.cj.day6.device;
class DVD implements RemoteControl{
    
	final int MAX_SOUND;
	final int MIN_SOUND;
	boolean powerOnOff;
	int currentVol;
	
	DVD(int volume){
		MAX_SOUND = 30;
		MIN_SOUND = 5;
		powerOnOff = false;
		currentVol = volume;
		System.out.println("Current volume level in DVD is "+currentVol);
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
		System.out.println("Current volume level in DVD is "+currentVol);
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
		System.out.println("Current volume level in DVD is "+currentVol);
		return currentVol;
	}

	@Override
	public void mute() {
       System.out.println("X Mute X");
	}
	
}