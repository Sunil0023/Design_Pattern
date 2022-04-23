package com.creational.laptopFactory;

public class Windows implements Laptop {

	@Override
	public void work() {
		System.out.println("Working from windows OS");
		System.out.println("!!!Thank you for choosing Windows!!! :)");
	}

}
