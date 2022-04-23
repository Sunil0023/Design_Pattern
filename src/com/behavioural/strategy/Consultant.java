package com.behavioural.strategy;

public class Consultant implements Role {

	@Override
	public String description() {
		return Consultant.class.getSimpleName();
	}

	@Override
	public String responsibility() {
		return "write Code.";
	}

}
