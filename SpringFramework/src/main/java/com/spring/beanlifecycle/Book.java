package com.spring.beanlifecycle;

public class Book {

	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
	//init() and destroy() methods are called by spring we need not to call it.
	//only we need to tell which method should be run at the time of initialization and 
	//which method should be run at the time of distroy in xml file means in between bean
	//init() method will call at the time of initialization 
	//destroy method will call at the time of destroy
	//we can give another name also for this init and destroy
	public void init()
	{
		System.out.println("Inside init() method");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy() method");
	}
}
