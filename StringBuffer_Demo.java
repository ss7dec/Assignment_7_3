//Assignment 7.3
//Write a program in java to show how the capacity is changing in StringBuffer 
//or in StringBuilder if we append the string.
//Hint: - The capacity changes according to the formula = Initial_capacity*2+2.

//This method returns the current capacity. 
//The capacity is the amount of storage available for newly inserted characters, beyond which 
//an allocation will occur.

//String Buffer Example

package assignment_7_3;

import java.util.Scanner;

/*
 * This example source code demonstrates the use of capacity() of StringBuffer class
 */

//A string buffer is like a String, but can be modified. At any point in time it 
//contains some particular sequence of characters, but the length and content of the 
//sequence can be changed through certain method calls.
//String buffers are safe for use by multiple threads. The methods are synchronized 
//where necessary so that all the operations on any particular instance behave as if 
//they occur in some serial order that is consistent with the order of the method calls 
//made by each of the individual threads involved.

public class StringBuffer_Demo {
public static void main(String[] args) {
	
	
        // initialize the StringBuffer object
        StringBuffer sb = new StringBuffer("");
        System.out.println("Initial Capacity is "+sb.capacity());
        // ask for user input
        System.out.print("Please enter any input:");
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        sb.append(s.nextLine());
        // print the length of string buffer contents
        System.out.println("Length after user input:"+sb.length());         
        System.out.println("capapcity after user input:"+sb.capacity());   
        sb.append("12345678");
        System.out.println("Current Length:"+sb.length());
        System.out.println("New Capacity:"+sb.capacity());
	}

}

//The principal operations on a StringBuffer are the append and insert methods, which are 
//overloaded so as to accept data of any type. 
//Every string buffer has a capacity. As long as the length of the character sequence contained 
//in the string buffer does not exceed the capacity, it is not necessary to allocate a new internal
//buffer array. If the internal buffer overflows, it is automatically made larger. 
