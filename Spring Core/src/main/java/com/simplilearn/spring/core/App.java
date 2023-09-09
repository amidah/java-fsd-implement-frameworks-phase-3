package com.simplilearn.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.simplilearn.spring.core.bean.Employee;
import com.simplilearn.spring.core.bean.Question;
import com.simplilearn.spring.core.bean.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Creating Bean Factory IOC Container
//		Resource resource = new ClassPathResource("applicationContext.xml");
//
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
//		Student student = (Student) beanFactory.getBean("studentbean");
		
		// Creating Application Context IOC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student = (Student) context.getBean("studentbean");
		
		Employee employee = (Employee) context.getBean("employeebean");
		
		Question question = (Question) context.getBean("questionbean");

		student.displayStudentInfo();
		
		employee.displayEmployeeInfo();
		
		question.displayQuestionInfo();

	}
}
