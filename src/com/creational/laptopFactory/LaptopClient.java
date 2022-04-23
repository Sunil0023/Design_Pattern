package com.creational.laptopFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaptopClient {
	
	public static void main(String[] args) throws Exception {
		LaptopFactory laptopFactory = new LaptopFactory();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("***** Welcome to Phone World *****");
		System.out.println("We have mac and windows laptops!");
		System.out.println("\nPlease ask which Laptop you want: ");
		String laptopType= br.readLine();
		Laptop laptop = laptopFactory.getLaptop(laptopType);
		laptop.work();
	}

}
