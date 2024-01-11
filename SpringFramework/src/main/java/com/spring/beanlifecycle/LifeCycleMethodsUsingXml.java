package com.spring.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMethodsUsingXml {

	public static void main(String[] args) {
		
		//registerShutdownHook() method is deprecated for ApplicationContext in this version so we use here AbstractApplicationContext
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/beanlifecycle/config.xml");
		Book book = (Book) applicationContext.getBean("book");
		System.out.println(book);
		//registring registerShutdownHook 
		//registerShutdownHook() this is use here for enable destroy method
		applicationContext.registerShutdownHook();
	}

}
