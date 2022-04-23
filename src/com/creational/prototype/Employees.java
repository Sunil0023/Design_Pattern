package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.empList=list;
	}

	public void loadData() {
		empList.add("Sunil");
		empList.add("Reeya");
		empList.add("Akancha");
		empList.add("Risabh");
	}

	public List<String> getEmpList(){
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String s : this.getEmpList()){
			temp.add(s);
		}
		//deep cloning
		return new Employees(temp);
		
		//shallow cloning need to check
//		Employees emp=(Employees) temp;
//		return this.getEmpList();
//		return this.getEmpList();

	}

}
