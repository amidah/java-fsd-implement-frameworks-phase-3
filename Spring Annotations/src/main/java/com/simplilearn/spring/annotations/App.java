package com.simplilearn.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.spring.annotations.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        employee.displayEmployeeInfo();
    }
}
