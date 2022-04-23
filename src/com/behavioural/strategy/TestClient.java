package com.behavioural.strategy;

public class TestClient {

	public static void main(String[] args) {
		
		Employee rahul = new Employee("Rahul", new Consultant());
		Employee sunil = new Employee("Sunil", new SeniorConsultant());
		
		System.out.println("*****************Before Promotion***************");

		System.out.println(rahul.grade());
		rahul.doWork();
		System.out.println(sunil.grade());
		sunil.doWork();
		
		//promote
		rahul.promote(new SeniorConsultant());
		sunil.promote(new LeadConsultant());
		
		System.out.println("*****************After Promotion***************");
		
		System.out.println(rahul.grade());
		rahul.doWork();
		System.out.println(sunil.grade());
		sunil.doWork();

	}

}
