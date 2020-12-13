package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept2 {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Raj",23,"QA");
		Employee e2 = new Employee("Shristi",23,"DEV");
		Employee e3 = new Employee("Puran",23,"QC");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		// iterate the arraylist //
	Iterator <Employee> it=	ar4.iterator();
	while(it.hasNext())
	{
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
	}
	}
	}

