package com.behavioural.command;

public class TvOffCommand implements Command {

	Tv tv;
	
	public TvOffCommand(Tv tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

}
