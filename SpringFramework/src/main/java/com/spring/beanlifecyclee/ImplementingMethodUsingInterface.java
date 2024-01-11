package com.spring.beanlifecyclee;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImplementingMethodUsingInterface {

	public static void main(String[] args) {
	
		//registerShutdownHook() method is deprecated for ApplicationContext in this version so we use here AbstractApplicationContext
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/beanlifecyclee/config.xml");
		Book book = (Book) context.getBean("book");
		//registring registerShutdownHook 
		//registerShutdownHook() this is use here for enable destroy method
		context.registerShutdownHook();
		System.out.println(book);
	}

}
