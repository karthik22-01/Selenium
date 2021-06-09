package com.kotak.loans.carloans;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) 
	{
	ArrayList<Object> a = new ArrayList<Object>();
	a.add(10);
	a.add(20);
	a.add("Karthik");
	a.add(12.34f);
	a.add(10);
	a.add(30);
	
	System.out.println(a);
	System.out.println(a.get(2));
	System.out.println(a.size());
	System.out.println(a.isEmpty());
	System.out.println(a);
	a.add(40);
	System.out.println(a);
	a.add(1, "Siva");
	System.out.println(a);
	System.out.println(a.subList(2, 6));
	System.out.println(a.contains("Karthik"));
	System.out.println(a);
	
	a.set(1, "Siva Naga");
	System.out.println(a);
	
	a.remove(3);
	System.out.println(a);
	
	a.remove("Siva Naga");
	System.out.println(a);
	
	a.clear();
	System.out.println(a);
	
	
	
	}


}
