package com.kotak.loans.homeloans;

import java.util.Scanner;

public class ExceptionDemo
{

	public static void main(String[] args)
	{
		int nr,dr,result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numarator value :");
		nr = sc.nextInt();
		System.out.println("Enter the Denominator value ;");
		dr = sc.nextInt();
		
		
		while (true) 
		{
			try 
			{
				result = nr / dr;
				System.out.println(result);
			} 
			catch (Exception e) 
			{

				e.printStackTrace();
			} 
			
			finally
			{
				System.out.println(" I am finally block.....");
			}
		}
		
		

	}

}
