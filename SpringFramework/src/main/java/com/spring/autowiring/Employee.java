package com.spring.autowiring;

public class Employee {

	private String name;
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
		System.out.println("Setter injection"); // is call when we use byName or byType
		this.address = address;
	}
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("Inside Constructor");
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
	
}
