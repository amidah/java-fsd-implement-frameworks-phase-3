package com.simplilearn.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.spring.annotations.bean.Department;
import com.simplilearn.spring.annotations.bean.Employee;
import com.simplilearn.spring.annotations.configuration.BeanConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Employee employee = (Employee) applicationContext.getBean("employee");
        employee.setId(1);
        employee.setName("Sam");
        Department department = (Department) applicationContext.getBean("department");
        department.setId(1);
        department.setName("IT");
        employee.setDepartment(department);
        employee.displayEmployeeInfo();
    }
}
