package com.recursion;

public class Q04 {

	public static void main(String[] args) {
		System.out.println(fun1(5,2));
	}
	
	static int fun1(int x, int y) 
	{ 
		if (x == 0) 
			return y; 
		else
			return fun1(x - 1, x + y); 
	}

}
