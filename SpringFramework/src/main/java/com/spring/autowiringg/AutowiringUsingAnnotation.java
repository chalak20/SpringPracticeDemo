package com.spring.autowiringg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringUsingAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/autowiringg/config.xml");
		Employee employee = (Employee) applicationContext.getBean("emp",Employee.class);
		System.out.println(employee);
	}

}
