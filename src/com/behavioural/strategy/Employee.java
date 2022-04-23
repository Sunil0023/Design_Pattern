package com.behavioural.strategy;

public class Employee {
	String name;
	Role role;

	public Employee(String name, Role role) {
		this.name = name;
		this.role = role;
	}
	
	public void promote(Role newRole) {
		role=newRole;
	}
	
	public String grade() {
		return this.name + " is a " +role.description()+"."; 
	}
	
	public void doWork() {
		System.out.println(name + " will " + role.responsibility());
	}

}
