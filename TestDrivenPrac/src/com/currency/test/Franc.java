package com.currency.test;

public class Franc extends Money{
	private String currency;
	
	public Franc(int amount, String currency) {
		super(amount, currency);
	}

	public Franc times(int multiplier) {
		return Money.franc(amount * multiplier);
	}

	@Override
	String currency() {
		return currency;
	}
}
