package com.creational.abstract_factory;

public class AbstractFactoryProducer {
	
	public FactoryType getFactoryType(String deviceType) throws Exception {
		if(deviceType.equals("laptop"))
			return new LaptopFactory();
		else if(deviceType.equals("phone"))
			return new PhoneFactory();
		else 
			throw new InvalidType("Invalid Device Type");
	}

}
