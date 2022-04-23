package com.creational.builder;

public class Computer {
	
	//required params
	private String hdd;
	private String ram;
	
	//optional params
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	//getters
	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	private Computer(ComputerBuilder builder) {
		this.hdd=builder.hdd;
		this.ram=builder.ram;
		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
	}
	
	//Builder class
	
	public static class ComputerBuilder{
		
		
		//required params
		private String hdd;
		private String ram;
		
		//optional params
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hdd, String ram) {
			this.hdd = hdd;
			this.ram = ram;
		}

		/**
		 * @param isGraphicsCardEnabled the isGraphicsCardEnabled to set
		 */
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		
		/**
		 * @param isBluetoothEnabled the isBluetoothEnabled to set
		 */
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		//Get object of the class using build() method 
		public Computer build() {
			return new Computer(this);
		}

	}
	
}

