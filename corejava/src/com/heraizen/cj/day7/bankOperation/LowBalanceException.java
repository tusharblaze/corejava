package com.heraizen.cj.day7.bankOperation;

public class LowBalanceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LowBalanceException(String msg) {
		super(msg);
	}
}
