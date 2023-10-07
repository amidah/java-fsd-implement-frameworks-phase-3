package com.simplilearn.spring.jdbcexample.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.simplilearn.spring.jdbcexample.bean.Employee;

@ExtendWith(MockitoExtension.class)
public class EmployeeDaoTest {

	@Mock
	private JdbcTemplate jdbcTemplate;

	@Mock
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@InjectMocks
	private EmployeeDao employeeDao;
	
	private Employee e;
	
	@BeforeEach
	void setup() {
		e = new Employee();
		e.setId(1);
		e.setName("John");
	}
	
	@Test
	void saveEmployeeTest() {
		
		Mockito.when(jdbcTemplate.update(Mockito.anyString())).thenReturn(1);
		
		int result = employeeDao.saveEmployee(e);
		
		assertEquals(1, result);
	}

}
