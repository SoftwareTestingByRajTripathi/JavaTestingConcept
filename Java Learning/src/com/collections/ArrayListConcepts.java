package com.collections;

import java.util.ArrayList;

public class ArrayListConcepts {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add("srishti");
		ar.add(22.09);
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		
		//For printing all index value 
		//1.using for loop
		//2.using iterator.
		System.out.println("**********************");
		for(int i =0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("******using itrator************");
	//non genric vs genric//
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(10);
		ar2.add(30);
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Raj");
		ar3.add("Selenium");
		
		
		
	}
	

}
