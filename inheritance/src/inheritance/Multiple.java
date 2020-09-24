package inheritance;

//Java program to illustrate the 
//concept of Multilevel inheritance 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class one 
{ 
	public void print_first() 
	{ 
		System.out.println("My"); 
	} 
} 

class two extends one 
{ 
	public void print_middle() 
	{ 
		System.out.println("name is "); 
	} 
} 

class three extends two 
{ 
	public void print_name() 
	{ 
		System.out.println("siddharth"); 
	} 
} 

//Drived class 
public class Multiple 
{ 
	public static void main(String[] args) 
	{ 
		three g = new three(); 
		g.print_first(); 
		g.print_middle(); 
		g.print_name(); 
	} 
} 

