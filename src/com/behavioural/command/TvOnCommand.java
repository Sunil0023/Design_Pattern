package com.behavioural.command;

public class TvOnCommand implements Command {

	Tv tv;
	
	public TvOnCommand(Tv tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}

}
