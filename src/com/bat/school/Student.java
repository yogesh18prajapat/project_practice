package com.bat.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student {
	private String name,section;
	private int age;
	private String department;
	private List<Subject> subjects;
	
	
	
	public Student() {
		super();
	}
	public Student(String name, String section, int age, String department) {
		super();
		this.name = name;
		this.section = section;
		this.age = age;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student {"
				+"\n name : "+this.name
				+",\n section : "+this.section
				+",\n department : "+this.department
				+",\n subjects"+Arrays.asList(this.subjects).toString()
				+"\n }";
	}
	
	
	

}
