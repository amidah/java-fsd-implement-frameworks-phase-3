package com.simplilearn.spring.core.bean;

public class Employee {

	private int id;
	private String name;
	private Address address; // aggregation

	public Employee() {
		System.out.println("defined constructor....");
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void displayEmployeeInfo() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Address: " + address.toString());
	}
	
}
