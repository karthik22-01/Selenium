package com.hdfc.loans.carloans;

public class B extends A
{
	public void m2()
	{
		System.out.println(" i am m2 from ClassB");
	}
	public static void main(String[] args) 
	{
B b=new B();
b.m2();
b.m1();

A a=new A();
a.m1();

	}

}
