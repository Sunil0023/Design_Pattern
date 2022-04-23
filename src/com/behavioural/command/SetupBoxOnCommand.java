package com.behavioural.command;

public class SetupBoxOnCommand implements Command {

	SetupBox setupBox;

	public SetupBoxOnCommand(SetupBox setupBox) {
		super();
		this.setupBox = setupBox;
	}

	@Override
	public void execute() {
		setupBox.on();
		setupBox.setChannel(123);
		setupBox.setVolume(7);
	}

}
