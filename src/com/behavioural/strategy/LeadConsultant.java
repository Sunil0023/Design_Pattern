package com.behavioural.strategy;

public class LeadConsultant implements Role {

	@Override
	public String description() {
		return LeadConsultant.class.getSimpleName();
	}

	@Override
	public String responsibility() {
		return "make tech decisions.";
	}

}
