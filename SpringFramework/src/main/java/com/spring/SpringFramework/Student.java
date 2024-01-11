package com.spring.SpringFramework;

public class Student {

	private Integer studId;
	private String studName;
	private String city;
	
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(Integer studId, String studName, String city) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", city=" + city + "]";
	}
	
	
}
