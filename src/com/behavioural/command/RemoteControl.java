package com.behavioural.command;

public class RemoteControl {
	
	Command command;
	
	public void setCommand(Command cmd) {
		this.command=cmd;
	}
	
	public void pressButton() {
		command.execute();
	}

}
