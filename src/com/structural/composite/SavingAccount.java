package com.structural.composite;

//Leaf class
public class SavingAccount implements Account {

	public String accountNo;
	private float accountBalalce;
	
	public SavingAccount(String accountNo, float accountBalalce) {
		super();
		this.accountNo = accountNo;
		this.accountBalalce = accountBalalce;
	}

	@Override
	public float getBalance() {
		return this.accountBalalce;
	}

}
