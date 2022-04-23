package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		
		DepositeAccount dAcc= new DepositeAccount("DAcc1234", 30000);
		DepositeAccount dAcc1= new DepositeAccount("DAcc2345", 50000);
		SavingAccount sAcc= new SavingAccount("SAcc", 70000);
		System.out.println(dAcc.accountNo+" :"+dAcc.getBalance());
		System.out.println(dAcc1.accountNo+" :"+dAcc1.getBalance());
		System.out.println(sAcc.accountNo+" :"+sAcc.getBalance());
		
		CompositeAccount cAccounts = new CompositeAccount();
		
		cAccounts.addAccount(dAcc);
		cAccounts.addAccount(dAcc1);
		cAccounts.addAccount(sAcc);
		System.out.println("My all accounts Balance: "+cAccounts.getBalance());
		
		cAccounts.removeAccount(dAcc1);
		System.out.println("My all accounts Balance after 1 a/c removed: "+cAccounts.getBalance());
	}

}
