package com.simplilearn.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.spring.autowiring.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee1 = (Employee) applicationContext.getBean("employee1");
        Employee employee2 = (Employee) applicationContext.getBean("employee2");
        employee1.displayEmployeeInfo();
        employee2.displayEmployeeInfo();
    }
}
