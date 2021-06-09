package com.hdfc.loans.carloans;

class parent
{
	public void workHard()
	{
	System.out.println("Parent: Wakeup early go to colleage");
}
	public void care()
	{
	System.out.println("Parent: atmost care");
}	
	
	
}
public class Child extends parent

{
	
	public void workHard()
	{
	System.out.println("Child: Wakeup anytime, go to bar...");
}
	
	public void love()
	{
	System.out.println("Child: i am in love....");
}

	public static void main(String[] args) 
	{
		
		Child c = new Child();
		c.love();
		c.care();
		c.workHard();
		
	}

}
