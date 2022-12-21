package com.bat.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CollectionsTesting {
	
	private static final String VALUE= "number";
	
	public static void main(String[] args) {
		
		 
		 checkNullIterations();
	 
	}
	
	private static void mapOperation() {
		String sample = "one,two,three,four,five,six";
		
		 List<String> eligible = Arrays.asList(sample.split(","));
		 System.out.println("Contains : "+eligible.contains("one"));
		 System.out.println("Contains : "+ eligible.contains(null));
		 
		 
		 Map<String,String> map = new LinkedHashMap();
		 
		 for(String entry : eligible) {
			 if(entry.equalsIgnoreCase("three")) {
				 map.put(entry, "If condition");
			 }else if(entry.equalsIgnoreCase("three")) {
				 map.put(entry+" dublicate", "else-if condition");
			 }else {
				 map.put(entry, VALUE);
			 }
		 }
		 
		 populate(map);
		 for(Map.Entry<String, String> entry : map.entrySet()) {
			 System.out.println(entry.getKey() +" : "+entry.getValue());
		 }
	}
	
	private static void populate(Map<String,String> map) {
		map.put("Method", "From Method");
	}
	
	
	private static void checkNullIterations() {
		
		List<String> list = null;
		
		for(String x :list) {
			System.out.println(x);
		}
		
	}
	

}

