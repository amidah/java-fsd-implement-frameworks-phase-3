package com.simplilearn.spring.core.bean;

import java.util.Iterator;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private List<Address> address;

	public Employee() {
		System.out.println("defined constructor....");
	}

	public Employee(int id, String name, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void displayEmployeeInfo() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Addresses: ");
		Iterator<Address> itr = address.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
