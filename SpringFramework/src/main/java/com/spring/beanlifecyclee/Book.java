package com.spring.beanlifecyclee;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// we use here two interface for implementing bean lifecycle
//InitializingBean interface used for init method 
// DisposableBean interface used for destroy method
public class Book implements InitializingBean,DisposableBean{

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

	//Init method which is implemented from InitializingBean this interface
	@Override
	public void afterPropertiesSet() throws Exception {
	
		System.out.println("Inside Init method");
	}

	//destroy method which is implemented from DisposableBean this interface
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
	}
	
	
}
