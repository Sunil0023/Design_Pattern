package com.creational.singleton;

public class Client {
	
	public static void main(String[] args) {

		System.out.println("******EagerInitializationSingleton*******");
		EagerInitializationSingleton eagerObj =EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton eagerObj1= EagerInitializationSingleton.getInstance();
		
		System.out.println(eagerObj.hashCode());
		System.out.println(eagerObj.hashCode());
		
		System.out.println("*******StaticBlockSingleton********");
		StaticBlockSingleton staicObj = StaticBlockSingleton.getInstance();
		StaticBlockSingleton staicObj1 = StaticBlockSingleton.getInstance();

		System.out.println(staicObj.hashCode());
		System.out.println(staicObj1.hashCode());

		System.out.println("*******LazyInitializedSingleton********");
		LazyInitializedSingleton lazyobj = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton lazyobj1 = LazyInitializedSingleton.getInstance();

		System.out.println(lazyobj.hashCode());
		System.out.println(lazyobj1.hashCode());

		System.out.println("********ThreadSafeSingleton*******");
		ThreadSafeSingleton tSafeObj = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton tSafeObj1 = ThreadSafeSingleton.getInstance();

		System.out.println(tSafeObj.hashCode());
		System.out.println(tSafeObj1.hashCode());

		System.out.println("********DoubleCheckThreadSafe*******");
		DoubleCheckThreadSafe dSafeObj = DoubleCheckThreadSafe.getInstanceUsingDoubleLocking();
		DoubleCheckThreadSafe dSafeObj1 = DoubleCheckThreadSafe.getInstanceUsingDoubleLocking();
		
		System.out.println(dSafeObj.hashCode());
		System.out.println(dSafeObj1.hashCode());

		System.out.println("********Thank You*******");
	}

}
