package com.simplilearn.spring.jdbcexample.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.simplilearn.spring.jdbcexample.bean.Employee;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into Employee values('" + e.getId() + "','" + e.getName() + "','" + e.getPassword()
				+ "', '" + e.getEmail() + "','" + e.getCountry() + "')";
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update Employee set name='" + e.getName() + "', password='" + e.getPassword() + "', email='"
				+ e.getEmail() + "', country='" + e.getCountry() + "' where id = '"+e.getId()+"'";

		return jdbcTemplate.update(query);
	}
	
	public int deleteEmployee(int id) {
		String query = "delete from Employee where id = '"+id+"'";
		return jdbcTemplate.update(query);
	}

}
