package com.spring.beanlifecycleee;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImplementingMethodUsingAnnotation {

	public static void main(String[] args) {
	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(" com/spring/beanlifecycleee/config.xml");
		Book book = (Book) context.getBean("book");
		context.registerShutdownHook();
		System.out.println(book);
	}

}
