package com.recursion;

public class Q05 {

	public static void main(String[] args) {
		System.out.println(fun1(8));
	}
	
	static int fun1(int n)
	{
	    if (n == 1)
	        return 0;
	    else
	        return 1 + fun1(n / 2);
	}
}
