//Assignment 7.3
//Write a program in java to show how the capacity is changing in StringBuffer 
//or in StringBuilder if we append the string.
//Hint: - The capacity changes according to the formula = Initial_capacity*2+2.

//This method returns the current capacity. 
//The capacity is the amount of storage available for newly inserted characters, beyond which 
//an allocation will occur.

//String Buffer Example i.e. ensureCapcity() String Buffer Method


package assignment_7_3;

public class StringBufferEnsureCapacity {
	public static void main(String args[])
	  {
	    StringBuffer sb1 = new StringBuffer("ok");
	    System.out.println("sb1 default capacity: " + sb1.capacity());      // 18
	    sb1.ensureCapacity(10);
	    System.out.println("sb1.ensureCapacity(10): " + sb1.capacity());    // 18 
	 
	    StringBuffer sb2 = new StringBuffer("abcdef");   // with some length, say 6
	    System.out.println("sb2 capacity with six characters size: " + sb2.capacity());  // 22
	    sb2.ensureCapacity(30);     
	    System.out.println("sb2.ensureCapacity(30): " + sb2.capacity());    // 46
	                                       // with length 0
	    StringBuffer sb3 = new StringBuffer();
	    System.out.println("sb3 default capacity: " + sb3.capacity());      // 16
	    sb3.ensureCapacity(50);
	    System.out.println("sb3.ensureCapacity(50): " + sb3.capacity());    // 50
	 
				                                                // negative value given
	    StringBuffer sb4 = new StringBuffer();
	    System.out.println("sb4 default capacity: " + sb4.capacity());      // 16
	    sb4.ensureCapacity(-50);
	    System.out.println("sb3.ensureCapacity(-50): " + sb4.capacity());   // 16
	  }

}

//ensureCapacity() StringBuffer method gives guarantee the existing capacity. It behaves
//in two ways depending on the argument passed to the method.
//1.	If the argument of the method is less than the existing capacity, then there will
//be no change in existing capacity (observe, sb1 in the example).
//2.	If the argument is greater than the existing capacity, there will be change in the 
//current capacity using following rule (observe, sb2 in the example).
//newcapacity = (oldcapacity*2) + 2.

