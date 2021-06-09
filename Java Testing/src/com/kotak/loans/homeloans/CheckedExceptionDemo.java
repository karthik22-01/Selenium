package com.kotak.loans.homeloans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo 
{
	public static void m1() throws Exception
	{
		BufferedReader b = new BufferedReader(new FileReader("d://abc.txt"));
	}

	public static void main(String[] args) throws Exception  
	{
		
     m1();
	}

}
