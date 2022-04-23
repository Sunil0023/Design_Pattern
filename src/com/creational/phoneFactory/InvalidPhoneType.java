package com.creational.phoneFactory;

public class InvalidPhoneType extends Exception {

	private static final long serialVersionUID = 4257786929552833157L;

	public InvalidPhoneType(String arg0) {
		super(arg0);
		System.out.println("Warning !!! Ohho You have entered the incorrect Phone Type!");
	}

}
