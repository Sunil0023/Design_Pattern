package com.creational.abstract_factory;

public class InvalidType extends Exception {

	private static final long serialVersionUID = -3565882425312652161L;

	public InvalidType(String arg0) {
		super(arg0);
		System.out.println("Warning !!! Ohho You have entered the incorrect device Type!");
	}

}
