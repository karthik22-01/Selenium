package com.kotak.loans.homeloans;

public class MyFinallyBlock {

	public static void main(String[] a) 
	{
		
     try {
		int i = 10/0;
	} catch (Exception e) 
     
    {
		System.out.println("Inside 1st Catch Block");
		
		
		}
     finally
     {
    	 System.out.println("Inside 1st finally block");
     }
     
     try {
		int i = 10/10;
	} catch (Exception e) 
     {
		System.out.println("Inside 2st Catch block");
	}
     
	
     finally
     {
    	 System.out.println("Inside 2st finally block");
     }
}
}
