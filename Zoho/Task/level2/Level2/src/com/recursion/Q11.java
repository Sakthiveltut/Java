package com.recursion;

public class Q11 {
	
    public static void main (String[] args) {
        abc("sakthi");
    }
	
	static void abc(String s)
	{
	    if (s.length() == 0)
	        return;

	    abc(s.substring(1));
	    abc(s.substring(1));
	    System.out.print(s.charAt(0));
	}
}
