package com.heraizen.cj.day6.device;

public interface RemoteControl {

		boolean powerOnOff(); // Returns new state, on = true
		int volumeUp(int increment); // Returns new volume level
		int volumeDown(int decrement); // Returns new volume level
		void mute(); // Mutes sound output
		
}




