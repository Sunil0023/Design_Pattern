package com.structural.composite;

//Leaf class
public class DepositeAccount implements Account {

	public String accountNo;
	private float accountBalance;
	
	public DepositeAccount(String accountNo, float accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	@Override
	public float getBalance() {
		return this.accountBalance;
	}

}
