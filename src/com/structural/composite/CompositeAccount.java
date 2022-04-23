package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

//Composite class
public class CompositeAccount implements Account {

	private List<Account> accountList =new ArrayList<Account>();

	private float totalBalance;

	@Override
	public float getBalance() {
		totalBalance=0;
		for(Account acc: accountList) {
			totalBalance+=acc.getBalance();
		}
		return totalBalance;
	}

	public void addAccount(Account account){
		accountList.add(account);
	}

	public void removeAccount(Account account) {
		accountList.remove(account);
	}

}
