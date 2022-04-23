package com.creational.laptopFactory;

public class LaptopFactory {

	public Laptop getLaptop(String laptopType) throws Exception {
		if(laptopType.equals("windows")) {
			return new Windows();
		}else if(laptopType.equals("mac")) {
			return new Mac();
		}else {
			throw new InvalidLaptopType("Invalid Laptop Type! Available Os is Windows and Mac");
		}
	}
}
