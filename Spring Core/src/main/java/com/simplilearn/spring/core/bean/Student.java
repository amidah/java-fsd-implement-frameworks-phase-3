package com.simplilearn.spring.core.bean;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	public void displayStudentInfo() {
		System.out.println("Hello: " + name);
	}

}
