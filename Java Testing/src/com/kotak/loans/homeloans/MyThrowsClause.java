package com.kotak.loans.homeloans;

public class MyThrowsClause 
{

	public static void main(String[] args) 
	{
		MyThrowsClause mytc = new MyThrowsClause();
		
		try {
			for(int i=0;i<5;i--)
			{
				mytc.getJunk();
				System.out.println(i);
			}
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}

		
	}

	private void getJunk() throws Exception
	{
		Thread.sleep(1000);
		
	}
	
}
