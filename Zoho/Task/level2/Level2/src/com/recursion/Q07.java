package com.recursion;

public class Q07 {

	public static void main(String[] args) {
		fun2(100);
	}
	
	static int LIMIT = 1000;
	static void fun2(int n)
	{
	    if (n <= 0) return;
	    if (n > LIMIT) return;
	 
	    System.out.print(String.format("%d ", n));
	    fun2(2 * n);
	    System.out.print(String.format("%d ", n));
	}
}
