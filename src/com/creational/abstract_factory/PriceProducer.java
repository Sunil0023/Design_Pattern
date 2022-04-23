package com.creational.abstract_factory;

public class PriceProducer {

	public static void main(String[] args) throws Exception {
		
		AbstractFactoryProducer absFProducer = new AbstractFactoryProducer();
		String deviceType="phone"; //laptop or phone
		FactoryType factoryType= absFProducer.getFactoryType(deviceType);
		String os = "android";// For laptop mac/windows os && for phone ios/android os
		Price OsType = factoryType.getFactoryOsType(os);
		String price= OsType.getPrice();
		System.out.println("Price of "+os+" :" +price);
	}

}
