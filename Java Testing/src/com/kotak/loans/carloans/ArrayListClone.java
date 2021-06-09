package com.kotak.loans.carloans;

import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("First");
		a.add("Second");
		a.add("Third");
		a.add("Random");
		System.out.println(" Actual ArrayList:" +a);
		ArrayList<String> copy = (ArrayList<String>) a.clone();
		System.out.println("Clone ArrayList:" +copy);
				
		

	}

}
