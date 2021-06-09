/*
 * package com.kotak.loans.carloans;
 * 
 * import java.util.ArrayList;
 * 
 * public class MyArrayListArray { 
 * public static void main(String a[]) 
 * {
 * ArrayList<String> arr = new ArrayList<String>(); 
 * arr.add("First");
 * arr.add("Second"); 
 * arr.add("Third"); 
 * arr.add("Random");
 * System.out.println("Actual ArrayList:" + arr); 
 * String[] strArr = new
 * String[arr.size()]; arr.toArray(strArr);
 * System.out.println("Create Array content:"); 
 * for(String str: strArr); {
 * System.out.println(str); } } }
 */


import java.util.ArrayList;
 
public class MyArrayListArray {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }
    }
}