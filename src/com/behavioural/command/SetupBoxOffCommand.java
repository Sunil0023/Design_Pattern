package com.behavioural.command;

public class SetupBoxOffCommand implements Command {

	SetupBox setupBox;

	public SetupBoxOffCommand(SetupBox setupBox) {
		super();
		this.setupBox = setupBox;
	}

	@Override
	public void execute() {
		setupBox.off();
	}

}
