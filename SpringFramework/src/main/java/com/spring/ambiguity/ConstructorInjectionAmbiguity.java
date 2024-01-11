package com.spring.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionAmbiguity {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/ambiguity/config.xml");
		Addition addition = (Addition) applicationContext.getBean("add");
		addition.doSum();
	}

}
