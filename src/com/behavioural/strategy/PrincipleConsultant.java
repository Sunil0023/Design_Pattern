package com.behavioural.strategy;

public class PrincipleConsultant implements Role {

	@Override
	public String description() {
		return PrincipleConsultant.class.getSimpleName();
	}

	@Override
	public String responsibility() {
		return "talk to clients.";
	}

}
