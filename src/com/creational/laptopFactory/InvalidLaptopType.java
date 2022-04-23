package com.creational.laptopFactory;

public class InvalidLaptopType extends Exception {

	private static final long serialVersionUID = -5040178513614298680L;

	public InvalidLaptopType(String arg0) {
		super(arg0);
		System.out.println("Warning !!! Ohho You have entered the incorrect Laptop Type!");
	}

}
