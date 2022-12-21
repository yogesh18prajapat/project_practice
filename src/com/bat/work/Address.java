package com.bat.work;

import java.util.List;

import com.bat.practice.comparator.State;

public class Address {
	private String house;
	private String town;
	private List<State> state;
	private int houseNo;
	public int getHouseNo() {
		return houseNo;
	}

	public Address(String house, String town, List<State> state, int houseNo) {
		super();
		this.house = house;
		this.town = town;
		this.state = state;
		this.houseNo = houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public Address(String house, String town, List<State> state) {
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

	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}
	
	
	

}
