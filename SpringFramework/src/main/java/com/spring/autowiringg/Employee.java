package com.spring.autowiringg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private String name;
	
	 //we can use autowired annotation on object,on constructor or on setter method 
	@Autowired
	@Qualifier("address1") //Qualifier annotation is used when more than one bean is present with same object
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside setter method");
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("Inside constructor");
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
	
}
