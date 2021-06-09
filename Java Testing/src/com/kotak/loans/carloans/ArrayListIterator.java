package com.kotak.loans.carloans;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("First");
		a.add("Second");
		a.add("Third");
		a.add("Random");
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		
			
		
			System.out.println(i.next());

	}

}
