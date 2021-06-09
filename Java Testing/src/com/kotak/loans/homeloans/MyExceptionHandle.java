package com.kotak.loans.homeloans;

/*
 * public class MyExceptionHandle {
 * 
 * public static void main(String[] args) { try { for(int i=5;i>0;i--) {
 * System.out.println(10/i); } } catch (Exception e) {
 * System.out.println("Exception Message:" +e.getMessage());
 * 
 * e.printStackTrace(); } System.out.println("After for loop..."); }
 * 
 * }
 */


 public class MyExceptionHandle
 {
	 public static void main(String a[])
	 {
		 for (int i=5;i>=0;i--)
		 {
			 System.out.println(10/i);
		 }
		 System.out.println("After for loop");
	 }
 }