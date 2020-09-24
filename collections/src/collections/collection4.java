package collections;

import java.util.*;
//Java program to demonstrate the 
//working of a stack 
 
public class collection4 { 
	public static void main(String args[]) 
	{ 
		Stack<String> stack = new Stack<String>(); 
		stack.push("my"); 
		stack.push("name"); 
		stack.push("is siddharth"); 
		stack.push("sharma"); 

		// Iterator for the stack 
		Iterator<String> itr 
			= stack.iterator(); 

		// Printing the stack 
		while (itr.hasNext()) { 
			System.out.print(itr.next() + " "); 
		} 

		System.out.println(); 

		stack.pop(); 

		// Iterator for the stack 
		itr 
			= stack.iterator(); 

		// Printing the stack 
		while (itr.hasNext()) { 
			System.out.print(itr.next() + " "); 
		} 
	} 
} 

