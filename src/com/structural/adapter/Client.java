package com.structural.adapter;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("Target Class:::");
		ChromeDriver chrome= new ChromeDriver();
		chrome.getElement();
		chrome.selectElement();
		
		System.out.println("Adaptee class:::");
		IeDriver ieDriver =new IeDriver();
		ieDriver.findElement();
		ieDriver.clickElement();
		
		System.out.println("Adpater Class:::");
		WebDriverAdapter adapter = new WebDriverAdapter(ieDriver);
		adapter.getElement();
		adapter.selectElement();
	}

}
