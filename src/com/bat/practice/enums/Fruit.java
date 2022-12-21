package com.bat.practice.enums;

public enum Fruit {
	 MANGO(120),ORANGE(75),BANANA(45),APPLE(250),GRAPES(145);
	private  double pricePerKG;
	
	Fruit(double pricePerKG) {
		this.pricePerKG = pricePerKG;
	}

	public double getPrice() {
		return pricePerKG;
	}
	
}
