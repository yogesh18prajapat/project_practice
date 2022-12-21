package com.bat.practice;

public class Student {

	
	private String x ;
	private String y;
	
//	public void student(Student s) {
//		setDefaultProperties(s);
//	}
	
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	
	public void setDefaultProperties() {
		this.setX("this is X");
		this.setY("this is Y");
	}
	
	
	
	
	
}
