package com.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	public String title;
	private List<Subscriber> subs = new ArrayList<>();
	
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	
	public void unSubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	public void notifySubscribers() {
		for(Subscriber s: subs) {
			s.update();
		}
	}
	
	public void upload(String title) {
		this.title=title;
		notifySubscribers();
	}
}
