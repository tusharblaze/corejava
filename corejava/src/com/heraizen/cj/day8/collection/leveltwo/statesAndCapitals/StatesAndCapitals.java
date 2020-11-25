package com.heraizen.cj.day8.collection.leveltwo.statesAndCapitals;

import java.util.HashMap;
import java.util.Map;

public class StatesAndCapitals {
	
	Map<String,String> state_capital = new HashMap<>();
	
	public void add_state_capital(String state, String capital){
		
		state_capital.put(state, capital);
	}
	
	public String viewCapital(String state) {
		
		return state_capital.get(state);
		
	}
	
	
	

}
