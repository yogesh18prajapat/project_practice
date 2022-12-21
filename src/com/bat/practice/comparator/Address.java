package com.bat.practice.comparator;

import java.util.List;

import com.bat.practice.comparator.State;

public class Address {
	private String house;
	private String town;
	private State state;
	
	public Address(String house, String town, State state) {
		this.house = house;
		this.town = town;
		this.state = state;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	

}
