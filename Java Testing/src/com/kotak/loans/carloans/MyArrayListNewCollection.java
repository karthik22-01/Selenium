package com.kotak.loans.carloans;


import java.util.ArrayList;
import java.util.List;

public class MyArrayListNewCollection {

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("First");
		a.add("Second");
		a.add("Third");
		a.add("Random");
		System.out.println("Actual ArrayList:" +a);
		List<String> l = new ArrayList<String>();
		l.add("One");
		l.add("Two");
		a.addAll(l);
		System.out.println("After copy:" +a);
		

	}

}
