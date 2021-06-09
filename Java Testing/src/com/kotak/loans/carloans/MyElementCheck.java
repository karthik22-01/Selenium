package com.kotak.loans.carloans;

import java.util.ArrayList;
import java.util.List;

public class MyElementCheck 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("First");
		a.add("Second");
		a.add("Third");
		a.add("Random");
		List<String> l = new ArrayList<String>();
		l.add("Second");
		l.add("Random");
		System.out.println("Does ArrayList contains all list elements?: " + a.containsAll(l));
		l.add("One");
		System.out.println("Does ArrayList contains all list elements?: " + a.containsAll(l));
		
		
		
	   
		
	}

}
