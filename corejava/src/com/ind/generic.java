package com.ind;

public class generic{
	   
	      
	   

	   public static void main(String args[]) {
		   
		   
		   
		   String b= "nirj";
		   String c=null;
		   
		 String v=  b.equals("no")&&c.equals("niraj")?"yes":"no";
		 System.out.println(v);
				   
	      // Create arrays of Integer, Double and Character
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 ,7};
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

	      System.out.println("Array integerArray contains:");
	     //System.out.print( printArray(intArray));   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      // System.out.println(printArray(doubleArray));   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      // System.out.println(printArray(charArray));   // pass a Character array
	   }
	}