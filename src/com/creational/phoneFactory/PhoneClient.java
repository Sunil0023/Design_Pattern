package com.creational.phoneFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PhoneClient {

	public static void main(String[] args) throws Exception {
		PhoneFactory factory = new PhoneFactory();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("***** Welcome to Phone World *****");
		System.out.println("We have ios, windows and andriod phones!");
		System.out.println("\nPlease ask which phone you want: ");
		String phoneType= br.readLine();
		Phone phone = factory.getPhone(phoneType);
		phone.call();
	}

}
