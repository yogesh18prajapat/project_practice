package com.bat.practice.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExampleMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ad",01,21);
		Employee e2 = new Employee("yo",01,23);
		Employee e3 = new Employee("sri",01,25);
		Employee e4 = new Employee("ra",01,21);


		List<Employee> employees = new ArrayList<>();
		Collections.addAll(employees, e1,e2,e4,e3);
		System.out.println("Before sorting : "+employees);
		employees.sort(new AgeComparator());
		System.out.println("After sorting Age : "+employees);
		employees.sort(new NameComparator());
		System.out.println("After sorting Name : "+employees);

	}

}
