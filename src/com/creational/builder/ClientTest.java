package com.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {

		Computer obj1 =new Computer.ComputerBuilder("1TB", "8GB").setGraphicsCardEnabled(true).build();
		Computer obj2 =new Computer.ComputerBuilder("512SSD", "8GB").setGraphicsCardEnabled(true).setBluetoothEnabled(true).build();

		List<Computer> list= new ArrayList();
		list.add(obj1);
		list.add(obj2);

		for(Computer com : list) {
			System.out.println("object:::"+ com.toString());
			System.out.print("Hard disk: "+ com.getHdd()+", ");
			System.out.print("Ram: "+ com.getRam()+", ");
			System.out.print("Graphics Card: "+com.isGraphicsCardEnabled()+", ");
			System.out.println("Bluetooth: "+com.isBluetoothEnabled()+".");
		}

	}

}
