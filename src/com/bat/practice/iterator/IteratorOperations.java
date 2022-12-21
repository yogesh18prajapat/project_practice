package com.bat.practice.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class IteratorOperations {
	public static void main(String[] args) {
		final List<String> strings = new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add("one");
		int count = 0;
		for(String s : strings) {
			if(!s.equals("two"))
				System.out.println("found two");
			else if (s.equals("three"))
				System.out.println("found three");
				
			System.out.println(count);
			count ++;
		}
		
	}
	

}
