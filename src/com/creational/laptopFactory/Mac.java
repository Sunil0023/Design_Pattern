package com.creational.laptopFactory;

public class Mac implements Laptop {

	@Override
	public void work() {
		System.out.println("Working from Mac OS");
		System.out.println("!!!Thank you for choosing Mac!!! :)");
	}

}
