package com.bat.work;

import java.util.List;

public class Worker {

	private String name;
	private int age;
	private List<Address> addresses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Worker(String name, int age, List<Address> addresses) {
		super();
		this.name = name;
		this.age = age;
		this.addresses = addresses;
	}
	
	
}
