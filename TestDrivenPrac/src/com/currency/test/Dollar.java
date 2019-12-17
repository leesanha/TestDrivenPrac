package com.currency.test;

public class Dollar extends Money{
	private String currency;

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}

	public Dollar times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}

	@Override
	String currency() {
		return currency;
	}
}
