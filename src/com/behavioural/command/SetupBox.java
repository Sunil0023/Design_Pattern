package com.behavioural.command;

public class SetupBox {
	
	public void on() {
		System.out.println("Setup Box is On.");
	}
	
	public void off() {
		System.out.println("Setup Box is off.");
	}
	
	public void setChannel(int defaultChannel) {
		System.out.println("Setup Box is set to channel: "+defaultChannel);
	}
	
	public void setVolume(int volume) {
		System.out.println("Setup Box is set to volume: "+volume);
	}

}
