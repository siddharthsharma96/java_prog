package inheritance;


class hone 
{ 
	public void print_first() 
	{ 
		System.out.println("My"); 
	} 
}

class htwo extends hone
{ 
	public void print_name() 
	{ 
		System.out.println("fullname is Siddharth sharma"); 
	} 
} 
class hthree extends hone 
{ 
	public void print_name() 
	{ 
		System.out.println("nickname is Sid sharma"); 
	} 
} 

//Drived class 
public class hierarc 
{ 
	public static void main(String[] args) 
	{ 
		htwo t=new htwo();
		hthree g = new hthree();
		g.print_first();
		g.print_name();
		t.print_first();
		t.print_name();
		
	} 
} 

