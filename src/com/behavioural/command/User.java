package com.behavioural.command;

public class User {

	public static void main(String[] args) {

		RemoteControl remote =new RemoteControl();
		SetupBox setupBox = new SetupBox();

		System.out.println("Show started...");
		
		remote.setCommand(new SetupBoxOnCommand(setupBox));
		remote.pressButton();

		Tv tv= new Tv();
		
		remote.setCommand(new TvOnCommand(tv));
		remote.pressButton();
		
		System.out.println("Show completed!!!");

		remote.setCommand(new TvOffCommand(tv));
		remote.pressButton();

		remote.setCommand(new SetupBoxOffCommand(setupBox));
		remote.pressButton();
		
	}
}
