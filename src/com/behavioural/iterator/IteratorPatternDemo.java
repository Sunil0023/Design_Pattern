package com.behavioural.iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {

		NameRepository repository =new NameRepository();
		
		System.out.println("***********using for loop**************");
		for(Iterator itr=repository.getIterator();itr.hasNext();) {
			String name=(String) itr.next();
			System.out.println("Name: "+name);
		}
		
		System.out.println("***********using while loop**************");
		Iterator itr1=repository.getIterator();
		while(itr1.hasNext()) {
			String name=(String) itr1.next();
			System.out.println("Name: "+name);
		}
	}

}
