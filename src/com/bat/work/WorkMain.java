package com.bat.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bat.practice.comparator.State;

public class WorkMain {

	public static void main(String[] args) {
		
		State s1 = new State("KA", "karnaataka");
		State s2 = new State("TG", "Telangana");
		State s3 = new State("RJ","Rajasthan");
		
		List<State> states1 = new ArrayList<>();
		List<State> states2 = new ArrayList<>();
		List<State> states3 = new ArrayList<>();
		
		Collections.addAll(states1, s1,s2,s3);
		Collections.addAll(states2, s1,s2,s3);
		Collections.addAll(states3, s1,s2,s3);

		
		Address a1 = new Address("house1", "Bangalore", states1,1);
		Address a2 = new Address("house2", "Hyderabad", states2,2);
		Address a3 = new Address("house3","Jaipur",states3,3);
		
		List<Address> addresses1 = new ArrayList<>();
		List<Address> addresses2 = new ArrayList<>();
		
		Collections.addAll(addresses1, a1,a2,a3);
		Collections.addAll(addresses2, a1,a2,a3);
		
		Worker worker1 = new Worker("worker1",10,addresses1);
		
		Address newAddress = new Address("house3","Jaipur",states3,3);
		System.out.println(worker1.getAddresses().get(0).getHouseNo());
		System.out.println(worker1.getAddresses().get(1).getHouseNo());
		System.out.println(worker1.getAddresses().get(2).getHouseNo());
		
//		List<Address> addresses = new ArrayList<>();
		List<Address> addresses3 = worker1.getAddresses();
		if (!worker1.getAddresses().isEmpty())
		{
			for (Address address : addresses3)
			{
				Integer houseNo = address.getHouseNo();
				if (address.getHouseNo() == 2)
				{
					houseNo += 10;
				}
				address.setHouseNo(houseNo);
//				addresses.add(address);
			}
			worker1.setAddresses(addresses3);
		}
//		else
//		{
//			addresses.add(newAddress);
//			worker1.setAddresses(addresses);
//		}
		System.out.println("----------------------------------------------------");
		System.out.println(worker1.getAddresses().get(0).getHouseNo());
		System.out.println(worker1.getAddresses().get(1).getHouseNo());
		System.out.println(worker1.getAddresses().get(2).getHouseNo());
	}
	
}
