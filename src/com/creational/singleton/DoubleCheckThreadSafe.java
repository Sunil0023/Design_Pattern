package com.creational.singleton;

public class DoubleCheckThreadSafe {

	private static DoubleCheckThreadSafe instance;

	private DoubleCheckThreadSafe() {}

	public static DoubleCheckThreadSafe getInstanceUsingDoubleLocking(){
		if(instance == null){
			synchronized (DoubleCheckThreadSafe.class) {
				if(instance == null){
					instance = new DoubleCheckThreadSafe();
				}
			}
		}
		return instance;
	}

}
