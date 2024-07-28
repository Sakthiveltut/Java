package com.recursion;

public class Q14 {
	
	static void fun(int n) 
    { 
        if (n > 0) { 
            fun(n - 1); 
            System.out.print(n + " "); 
            fun(n - 1); 
        } 
    } 
  
    public static void main(String[] args) { fun(4); } 
}
