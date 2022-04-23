package com.behavioural.observer;

public class Youtube {

	public static void main(String[] args) {
		
		Channel funFacts = new Channel();
		
		Subscriber s1= new Subscriber("Navin");
		Subscriber s2= new Subscriber("Sunil");
		Subscriber s3= new Subscriber("Amit");
		Subscriber s4= new Subscriber("Reena");
		Subscriber s5= new Subscriber("Nidhi");

		funFacts.subscribe(s1);
		funFacts.subscribe(s2);
		funFacts.subscribe(s3);
		funFacts.subscribe(s4);
		funFacts.subscribe(s5);
		
		//funFacts.unSubscribe(s1); if uncomment this subscriber won't get notification
		
		s1.subscribeChannel(funFacts);
		s2.subscribeChannel(funFacts);
		s3.subscribeChannel(funFacts);
		s4.subscribeChannel(funFacts);
		s5.subscribeChannel(funFacts);

		funFacts.upload("\"How Flights fly?\".");
	}

}
