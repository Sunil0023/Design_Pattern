package com.creational.abstract_factory;

public class PhoneFactory implements FactoryType {

	@Override
	public Price getFactoryOsType(String osType) throws Exception {
		if(osType.equals("ios"))
			return new Ios();
		else if(osType.equals("android"))
			return new Android();
		else
			throw new InvalidType("invlaid Phone Type");
	}

}
