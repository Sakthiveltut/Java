package com.recursion;

public class Example2 {

	public static void main(String[] args) {
		int result = fibo(5);
		System.out.println(result);
	}

	private static int fibo(int n) {
		if(n<2) {
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}

}
