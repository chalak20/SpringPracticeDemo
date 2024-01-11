package com.spring.SpringFramework.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String name;
	private List<String> phoneNo;
	private Set<String> address;
	private Map<String,String> courses;
	
	public String getName() {
		return name;
	}
	//Setter injection
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneNo() {
		return phoneNo;
	}
	//Setter injection
	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Set<String> getAddress() {
		return address;
	}
	//Setter injection
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	//Setter injection
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee(String name, List<String> phoneNo, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneNo=" + phoneNo + ", address=" + address + ", courses=" + courses
				+ "]";
	}
	
	
}
