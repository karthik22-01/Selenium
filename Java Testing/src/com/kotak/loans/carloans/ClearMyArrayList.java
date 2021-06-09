package com.kotak.loans.carloans;

import java.util.ArrayList;

public class ClearMyArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("First");
		a.add("Second");
		a.add("Third");
		a.add("Random");
		System.out.println("Actual ArrayList:" +a);
		a.clear();
		System.out.println("After clear ArrayList:" +a);
	}

}
