package com.bat.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.bat.practice.comparator.Address;
import com.bat.practice.comparator.Employee;
import com.bat.practice.comparator.State;

public class University {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		State s1 = new State("KA", "karnaataka");
		State s2 = new State("TG", "Telangana");
		State s3 = new State("RJ","Rajasthan");
		State s4 = null;

		Address a1 = new Address("house1", "Bangalore", s4);
		Address a2 = new Address("house2", "Hyderabad", s2);
		Address a3 = new Address("house3","Jaipur",s3);
		Address a4 = null;

		Employee e1 = new Employee("Ad", 01, 21);
		e1.setAddress(a1);
		Employee e2 = new Employee("yo", 02, 23);
		e2.setAddress(a4);
		Employee e3 = new Employee("ha", 03, 20);
		e3.setAddress(a3);
		Employee e4 = null;

		Collections.addAll(employees, e1, e2, e3,e4);

		if (employees != null && employees.size() > 0) {
			List<String> collect = employees.stream()
					.filter(employee -> 
										employee != null && employee.getAddress() != null && employee.getAddress().getState() != null)
					.peek(System.out::println)
					.map(employee -> employee.getAddress().getState().getState_id())
					.collect(Collectors.toList());

			collect.forEach(x -> System.out.println(x));
			
			System.out.println(String.format("there are %s & %s & %s.", 10,15,null));
			
//				 .filter(employee ->  employee.getAddress() != null)
//				 .map(employee ->  employee.getAddress())
//				 .filter(address -> address.getState() != null)
//				 .map(address -> address.getState().getState_id())
//				 .map(id -> id = "changedId")
//				 .collect(Collectors.toList());
//			collect.forEach(x -> System.out.println(x));
		}

	}

}
