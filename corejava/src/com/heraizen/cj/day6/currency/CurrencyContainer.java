package com.heraizen.cj.day6.currency;

public class CurrencyContainer {

	static Currency getCurrency(String name) {
		if (name.equalsIgnoreCase("India")) {
			return new India();
		} else if (name.equalsIgnoreCase("UK")) {
			return new UK();
		} else if (name.equalsIgnoreCase("USA")) {
			return new USA();
		} else {
			throw new IllegalArgumentException();
		}

	}

}
