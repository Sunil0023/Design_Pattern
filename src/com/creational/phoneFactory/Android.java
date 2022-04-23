package com.creational.phoneFactory;

public class Android implements Phone {

	@Override
	public void call() {
		System.out.println("Calling from android phone");
		System.out.println("!!!Thank you for choosing android!!!:)");
	}

}
