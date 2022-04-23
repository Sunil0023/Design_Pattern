package com.structural.adapter;

public class WebDriverAdapter implements WebDriver {
	
	IeDriver ieDriver;

	public WebDriverAdapter(IeDriver ieDriver) {
		super();
		this.ieDriver = ieDriver;
	}

	@Override
	public void getElement() {
		ieDriver.findElement();

	}

	@Override
	public void selectElement() {
		ieDriver.clickElement();
	}

}
