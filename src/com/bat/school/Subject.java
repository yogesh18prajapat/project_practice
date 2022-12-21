package com.bat.school;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private String name;
	private long marks;
	public Subject() {
		super();
	}
	public Subject(String name, long marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return this.name+","+this.marks;
	}
	
	

}
