package com.heraizen.cj.day6;

public interface Currency {
	public String getCurrency();
}

class India implements Currency{

	@Override
	public String getCurrency() {
		
		return "INR";
	}
	
}

class UK implements Currency{

	@Override
	public String getCurrency() {
		
		return "GBP";
	}
	
}

class USA implements Currency{

	@Override
	public String getCurrency() {
		
		return "USD";
	}
	
}