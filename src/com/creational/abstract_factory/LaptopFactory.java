package com.creational.abstract_factory;

public class LaptopFactory implements FactoryType {

	@Override
	public Price getFactoryOsType(String osType) throws Exception {
		if(osType.equals("mac"))
			return new Mac();
		else if(osType.equals("windows"))
			return new Windows();
		else
			throw new InvalidType("invlaid Laptop Type");
	}

}
