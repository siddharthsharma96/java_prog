package com.lara;
public class M1 
{
	public static void main(String[] args)
	{
		int[] elements = new int[5];
		System.out.println(elements[0]);
		System.out.println(elements[1]);
		System.out.println(elements[2]);
		System.out.println(elements[3]);
		System.out.println(elements[4]);
		System.out.println("done");
	}
}
/*
array is object in java, you should use new operator. reference variable should be same as data type.
here it should be int type, even object is also int type.
index is 0 to 4 , we have to specify size in array.
if array size is 5 , then index will be 0 to 4
arrays are used or storing multiple elements. it is like container, i want to store 5 elements , that is of int type
by using index we can refer location, it has separate location

0
0
0
0
0
done

for int , 0 is default value.
every location of the array int will initialize with 0.
*/