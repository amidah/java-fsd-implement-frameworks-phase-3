package com.simplilearn.spring.annotations.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	private int id;

	private String name;

	@Autowired // field injection
	private Department department;

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void displayEmployeeInfo() {
		System.out.println("Employee Info: " + id + " " + name);
		System.out.println("Employee Department Info: " + department);
	}

}
