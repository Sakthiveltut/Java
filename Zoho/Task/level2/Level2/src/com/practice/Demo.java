package com.practice;

import java.util.*;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
    	for(int i=2, j=1;i<100 && j<=20;i++) {
    		if(isPrime(i)) {
    			System.out.println(i);
    			j++;
    		}
    	}
    }
    
    private static boolean isPrime(int num) {
    	for(int i=2;i<num;i++) {
    		if(num%i==0) {
    			return false;
    		}
    	}
    	return true;
    }
     
}



