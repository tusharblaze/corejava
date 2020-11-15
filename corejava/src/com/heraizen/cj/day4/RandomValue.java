package com.heraizen.cj.day4;

import java.util.concurrent.ThreadLocalRandom;

public class RandomValue {

	public static void main(String[] args) {
		System.out.println(ThreadLocalRandom.current().nextInt(0, 100));
	}

}
