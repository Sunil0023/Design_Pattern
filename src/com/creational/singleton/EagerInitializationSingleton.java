package com.creational.singleton;

public class EagerInitializationSingleton {
	
	//1. private static class
	private final static EagerInitializationSingleton obj= new EagerInitializationSingleton();
	
	//no public constructor
	private EagerInitializationSingleton() {}
	
	//no setter
	
	//public static method to fetch object
	public static EagerInitializationSingleton getInstance() {
		return obj;
	}

}
