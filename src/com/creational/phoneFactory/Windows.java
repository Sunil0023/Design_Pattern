package com.creational.phoneFactory;

public class Windows implements Phone {

	@Override
	public void call() {
		System.out.println("Calling from windows phone");
		System.out.println("!!!Thank you for choosing windows!!! :)");
	}

}
