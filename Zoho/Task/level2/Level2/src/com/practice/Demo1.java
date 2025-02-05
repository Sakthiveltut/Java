package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 { 
	 
    public static void main(String[] args) { 
    	String s = "                  sdfsdf a                  ";
        System.out.println(s.split("\\s+"));
        
        String sArr[] = s.split(" ");
        System.out.println(sArr[sArr.length-1]);
        System.out.println(Arrays.toString(sArr));
        
    } 
}

  