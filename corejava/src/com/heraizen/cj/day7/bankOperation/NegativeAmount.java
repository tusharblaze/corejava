package com.heraizen.cj.day7.bankOperation;

public class NegativeAmount extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NegativeAmount(String msg) {
		super(msg);
	}

}
