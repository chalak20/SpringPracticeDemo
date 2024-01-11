package com.spring.ambiguity;

public class Addition {

	private Integer a;
	private Integer b;
	
	public Addition(double a,double b)
	{
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("constructor Double , Double");
	}
	
	public Addition(Integer a,Integer b)
	{
		this.a=a;
		this.b=b;
		System.out.println("constructor integer , integer");
	}
	
	public Addition(String a,String b)
	{
		this.a=Integer.parseInt(a) ;
		this.b=Integer.parseInt(b);
		System.out.println("constructor String , String");
	}
	
	public void doSum()
	{
		System.out.println("Sum is = "+(a+b ));
	}
	
}
