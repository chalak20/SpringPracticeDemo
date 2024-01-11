package com.spring.constructorInjection;

public class Person {

	private String name;
	private Integer id;
	private Certificate certificate;
	
	public Person(String name,Integer id, Certificate certificate)
	{
		this.id=id;
		this.name=name;
		this.certificate=certificate;
	}

	@Override
	public String toString() {
		return this.id+" : "+this.name+" { "+this.certificate+" }";
	}
	
	
}
