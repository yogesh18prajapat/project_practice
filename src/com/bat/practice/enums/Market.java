package com.bat.practice.enums;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


public class Market {
	public static void main(String[] args) {
		
		
		Map<Fruit,Double> cart1 = new HashMap<Fruit,Double>();
//		cart1.put(Fruit.MANGO,0.25);
//		cart1.put(Fruit.ORANGE,0.5);
//		cart1.put(Fruit.APPLE, 0.75);
		cart1.put(Fruit.BANANA, 1.0);
		
		
		EnumMap<Fruit, Double> cart = new EnumMap<>(Fruit.class);
		cart.put(Fruit.MANGO,0.25);
		cart.put(Fruit.ORANGE,0.5);
		cart.put(Fruit.APPLE, 0.75);
//		cart.put(null, 0.0);
//		double totalPrice = 
//		cart.keySet().stream()
//					 .mapToDouble(x ->
//						 {
//						   System.out.println(x.toString()+":"+x.getPrice()+"*"+cart.get(x)+"->"+x.getPrice()*cart.get(x));
//						   return x.getPrice()*cart.get(x);
//						  })
//					 .peek(System.out::println).sum();
//		System.out.println("Count : "+totalPrice);
		
		boolean containsKey = cart.containsKey(Fruit.APPLE);
		System.out.println(containsKey);
//		System.out.println(cart.keySet());
		
		System.out.println(cart.equals(cart1));
		
	}
		
}
