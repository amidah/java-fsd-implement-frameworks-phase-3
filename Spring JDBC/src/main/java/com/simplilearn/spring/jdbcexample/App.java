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
    
        int status = employeeDao.deleteEmployee(100);
        if(status > 0) {
        	System.out.println("Operation Successful");
        }
    }
}
