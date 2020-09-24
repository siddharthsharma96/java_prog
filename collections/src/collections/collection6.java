package collections;

//Java program to demonstrate the working of 
//priority queue in Java 
import java.util.*; 

class collection6 { 
	public static void main(String args[]) 
	{ 
		// Creating empty priority queue 
		PriorityQueue<Integer> pQueue 
			= new PriorityQueue<Integer>(); 

		// Adding items to the pQueue using add() 
		pQueue.add(10); 
		pQueue.add(20); 
		pQueue.add(15); 
		//printing all the element of priorityQueue
		System.out.println(pQueue);
		// Printing the top element of PriorityQueue 
		System.out.println(pQueue.peek()); 
		//printing all the element of priorityQueue
		System.out.println(pQueue);
		// Printing the top element and removing it 
		// from the PriorityQueue container 
		System.out.println(pQueue.poll()); 
		//printing all the element of priorityQueue
		System.out.println(pQueue);
		// Printing the top element again 
		System.out.println(pQueue.peek());
		//printing all the element of priorityQueue
		System.out.println(pQueue);
	} 
} 

