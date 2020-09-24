package collections;
import java.util.*;
//Java program to demonstrate the 
//working of a HashSet  
public class collection8 { 
	public static void main(String args[]) 
	{ 
		// Creating HashSet and 
		// adding elements 
		HashSet<String> hs = new HashSet<String>(); 

		hs.add("hi"); 
		hs.add("i"); 
		hs.add("have"); 
		hs.add("done"); 
		hs.add("Post graduation"); 

		// Traversing elements 
		Iterator<String> itr = hs.iterator(); 
		while (itr.hasNext()) { 
			System.out.println(itr.next()); 
		} 
	} 
} 
