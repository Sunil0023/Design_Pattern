package com.creational.phoneFactory;

public class Ios implements Phone {

	@Override
	public void call() {
		System.out.println("Calling from ios phone");
		System.out.println("!!!Thank you for choosing ios!!!:)");
	}

}
