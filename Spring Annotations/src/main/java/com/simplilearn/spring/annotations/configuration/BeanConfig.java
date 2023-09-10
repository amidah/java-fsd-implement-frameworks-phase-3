package com.simplilearn.spring.annotations.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simplilearn.spring.annotations.bean.Department;
import com.simplilearn.spring.annotations.bean.Employee;

@Configuration
public class BeanConfig {

	@Bean(name="employee")
	public Employee employee() {
		return new Employee();
	}
	
	@Bean(name="department")
	public Department department() {
		return new Department();
	}
	
	
}
