package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringUsingXml {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/autowiring/config.xml");
		Employee employee = (Employee) applicationContext.getBean("emp",Employee.class);
		System.out.println(employee);
	}

}
