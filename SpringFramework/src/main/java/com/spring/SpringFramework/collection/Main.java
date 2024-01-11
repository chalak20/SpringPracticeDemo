package com.spring.SpringFramework.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SpringFramework/collection/collectionconfig.xml");
		Employee emp1 = (Employee) context.getBean("emp");
		System.out.println(emp1);
		System.out.println();
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhoneNo());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());
	}
}
