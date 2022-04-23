package com.structural.adapter;

public class ChromeDriver implements WebDriver {

	@Override
	public void getElement() {
		System.out.println("From ChromeDriver getElement()");
	}

	@Override
	public void selectElement() {
		System.out.println("From ChromeDriver selectElement()");
	}

}
