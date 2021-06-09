package com.hdfc.loans.carloans;

public class DataTypes
{

	//integral DataType
	byte b; // 1 byte
	short s; // 2 bytes
	int i; // 4 bytes
	long l; // 8 bytes
	
	//float DataTypes
	float f; // 4 bytes
	double d =23.31; // 8 bytes
	
	boolean bb=false;
	char ch = 'a'; //2 bytes
	
	static String cname;
	
	public static void main(String[] args)
	
	{
		int x=100;
		
		DataTypes obj = new DataTypes();
		System.out.println("Byte : "+ obj.b);
		System.out.println("Short :" + obj.s);
		System.out.println("Int :" + obj.i);
		System.out.println("Long : " + obj.l);
		
		
		System.out.println("Float : "+ obj.f);
		System.out.println("Double : "+ obj.d);
						
		System.out.println("Boolean : "+ obj.bb);
		System.out.println("Char  "+ obj.ch);
	
		System.out.println("String: "+ obj.s);
	
		
		System.out.println("CName : "+ DataTypes.cname);
		
		System.out.println("X :" + x);
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
