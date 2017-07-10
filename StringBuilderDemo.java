//Assignment 7.3
//Write a program in java to show how the capacity is changing in StringBuffer 
//or in StringBuilder if we append the string.
//Hint: - The capacity changes according to the formula = Initial_capacity*2+2.

//This method returns the current capacity. 
//The capacity is the amount of storage available for newly inserted characters, beyond which 
//an allocation will occur.

//String Builder Example


//The StringBuilder class was added in Java 5. It has exactly the same API as the StringBuffer
//class, except StringBuilder is not thread safe. In other words, its methods are not synchronized. 

//Sun recommends that you use StringBuilder instead of StringBuffer whenever possible because 
//StringBuilder will run faster. So apart from synchronization, anything we say about StringBuilder's 
//methods holds true for StringBuffer's methods, and vice versa.

//The java.lang.StringBuilder.capacity() method returns the current capacity. The capacity is the 
//amount of storage available for newly inserted characters, beyond which an allocation will occur.


package assignment_7_3;

	public class StringBuilderDemo {

	   public static void main(String[] args) {
	  
	      StringBuilder str1 = new StringBuilder("The UNO");
	      System.out.println("string1 = " + str1);

	      // returns the current capacity of the string Builder 1
	      System.out.println("Old Capacity = " + str1.capacity());
	      /* increases the capacity, as needed, to the specified amount in the 
	         given StringBuilder object */
	   
	      // returns twice the capacity plus 2
	      str1.ensureCapacity(28);
	      System.out.println("New Capacity = " + str1.capacity());

	      StringBuilder str2 = new StringBuilder("compile online");
	      System.out.println("string2 = " + str2);
	   
	      // returns the current capacity of string Builder 2
	      System.out.println("Old Capacity = " + str2.capacity());
	      /* returns the old capacity as the capacity ensured is less than the
	         old capacity */
	      str2.ensureCapacity(29);
	      System.out.println("New Capacity = " + str2.capacity());
	   }


}
