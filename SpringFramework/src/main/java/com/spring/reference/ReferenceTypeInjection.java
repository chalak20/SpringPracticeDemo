package com.spring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceTypeInjection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/reference/refconfig.xml");
		A a = (A) context.getBean("aref");
		System.out.println(a);
		System.out.println(a.getX());
		
		System.out.println(a.getB().getY());
	}

}
