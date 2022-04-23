package com.creational.singleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton obj;
	
	private StaticBlockSingleton() {}
	
	static {
		try {
			obj=new StaticBlockSingleton();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return obj;
	}

}
