package com.spring.beanlifecycleee;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {

	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	

	// Implementing Bean LifeCycle using Annotations @PostConstruct and @PreDestroy
	// this annotations are byDefault disabled we need to enable in configuration file using <context:annotation-config>  tag 
	@PostConstruct
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
}
