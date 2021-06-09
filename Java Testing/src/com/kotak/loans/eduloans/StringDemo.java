package com.kotak.loans.eduloans;

public class StringDemo {

	public static void main(String[] args) 
	{
		String s1 = "karthik";
		System.out.println(s1);
		System.out.println(s1.indexOf('r'));
		System.out.println(s1.charAt(4));
		System.out.println(s1.length());
		
		String s2= new String("sivanaga");
		System.out.println(s2);
		
		String s3 = "Karthik";
		String s4 = "karthi";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.contains(s4));
		System.out.println(s3.toLowerCase().contains(s4.toLowerCase()));
		
		System.out.println("========================================");
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		
		System.out.println(s3.substring(2, 7));
		System.out.println(s3.startsWith("Kar"));
		
		System.out.println(s3.endsWith("hik"));
		
		System.out.println(s3);
		System.out.println(s3.replace('K', 'V'));
		
		String s5= "karthik";
		
		System.out.println(s3.equalsIgnoreCase(s5));
		System.out.println(s5);
		System.out.println(s5.trim());
		System.out.println(s3.equalsIgnoreCase(s5.trim()));
		
		System.out.println(s3.toLowerCase().equals(s5.trim()));
		
		String s6 = " kar thik sivanaga";
		String[] str = s6.split(" ");
		for(String s:str)
		{
		     System.out.println(s);
	}
for(int i=0;i<str.length;i++)
{
	System.out.println(str[i]);
	
	System.out.println(s1.concat(s2));
	System.out.println(s1+s2);
}
}
}
