package com.bat.practice.comparator;

import java.util.Comparator;

public class NameComparator  implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		String e1Name = e1.getName();
		String e2Name = e2.getName();
		
		int value = e1Name.compareTo(e2Name);
		
		return value;
		
//		return e1.getName().compareTo(e2.getName());
	}




}
