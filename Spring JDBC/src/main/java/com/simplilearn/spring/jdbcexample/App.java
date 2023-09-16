package com.simplilearn.spring.jdbcexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.spring.jdbcexample.bean.Employee;
import com.simplilearn.spring.jdbcexample.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
    
//        int status = employeeDao.saveEmployee(new Employee(100, "Jonathan", "Jon@1468", "jon.rambo@gmail.com", "USA"));
//        if(status > 0) {
//        	System.out.println("Operation Successful");
//        }
        
        Boolean status = employeeDao.saveEmployeeByPreparedStatement(new Employee(102, "Wayne", "wayne@1023", "wayne@hotmail.com", "AUS"));
    
        if(!status) {
        	System.out.println("Operation Successful");
        }
    }
}
