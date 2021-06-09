package com.hdfc.loans.carloans;

public class Methodoverloading 
{

	public void add(int x)
	{
		System.out.println(x);
	
	}
	
	public void add(float x)
	{
		System.out.println(x);
	
	}
	
	public void add(String x)
	{
		System.out.println(x);
	
	}
	
	public void add(Number x)
	{
		System.out.println(x);
	
	}
	public void  (Integer x)
	{
		System.out.println(x);
	
	}
	public void add(Object x)
	{
		System.out.println(x);
	
	}
	public static void main(String[] args)
	{
		Methodoverloading obj= new Methodoverloading();
		obj.add(100);
		obj.add(12.34f);
		obj.add("Karthik");
		obj.add(222);
		obj.add(143);
		obj.add("kopo98-0");
		
	}

}
