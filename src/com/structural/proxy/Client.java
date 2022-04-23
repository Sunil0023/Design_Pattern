package com.structural.proxy;

public class Client {

	public static void main(String[] args) throws Exception {

		DataBaseExecuterProxy proxy = new DataBaseExecuterProxy("admin", "1234");
		proxy.executeDataBase("DELETE");

		DataBaseExecuterProxy proxy2 = new DataBaseExecuterProxy("non-admin", "1234");
		proxy.executeDataBase("SELECT");

		DataBaseExecuterProxy proxy1 = new DataBaseExecuterProxy("non-admin", "1234");
		proxy.executeDataBase("DELETE");

	}

}
