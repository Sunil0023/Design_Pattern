package com.structural.proxy;

public class DataBaseExecuterImpl implements DataBaseExecuter {

	@Override
	public void executeDataBase(String query) {
		System.out.println("Execute DataBase Query: " + query);
	}

}
