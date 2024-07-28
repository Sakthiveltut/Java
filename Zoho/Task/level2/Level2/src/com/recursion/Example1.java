package com.recursion;

public class Example1 {

	public static void main(String[] args) {
		print(2);
	}

	private static void print(int i) {
		if(i==0) {
			return;
		}
		print(i-1);
		System.out.println(i);
	}

}
