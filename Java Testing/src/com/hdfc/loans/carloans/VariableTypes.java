package com.hdfc.loans.carloans;

public class VariableTypes 
{
 int x=100;
 static String cname = "Karthik"; 
 
 public void m1()
 {
	 int x=200;
	 System.out.println(x);
	 System.out.println(this.x);

 }
 public static void main(String[] args)
 {
VariableTypes obj = new VariableTypes();
System.out.println(obj.x);
System.out.println(cname);

obj.m1();

}
}
