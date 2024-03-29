package com.spring.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/constructorInjection/ciconfig.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}

}
