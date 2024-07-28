package com.recursion;

public class Q06 {

	public static void main(String[] args) {
		fun2(21);
	}
	
	static void fun2(int n)
	{
		if(n == 0)
		    return;
		  
		fun2(n/2);
		System.out.println(n%2);
	}
}
