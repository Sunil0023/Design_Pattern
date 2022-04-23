package com.behavioural.strategy;

public class SeniorConsultant implements Role {

	@Override
	public String description() {
		return SeniorConsultant.class.getSimpleName();
	}

	@Override
	public String responsibility() {
		return "review the code.";
	}

}
