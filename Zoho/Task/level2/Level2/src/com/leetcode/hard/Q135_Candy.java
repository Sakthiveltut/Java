package com.leetcode.hard;

import java.util.Arrays;

public class Q135_Candy {

	public static void main(String[] args) {
		//System.out.println(candy(new int[] {5,3,2,1,2,6,5,4,4,7}));
		//System.out.println(candy(new int[] {1,0,2}));
		System.out.println(candy(new int[] {1,3,4,5,2}));
	}
	

    public static int candy(int[] ratings) {
        
    	int[] arr = new int[ratings.length];
    	
    	arr[0] = 1;
    	for(int i=1;i<arr.length;i++) {
    		if(ratings[i-1]>=ratings[i]) arr[i] = 1;
    		else if(ratings[i-1]<ratings[i]) arr[i] = arr[i-1]+1;
    	}
    	
    	System.out.println(Arrays.toString(arr));
    	
    	//arr[ratings.length-1] = 1;
    	for(int i=arr.length-2;i>=0;i--) {
    		//if(ratings[i+1]>=ratings[i]) arr[i] = 1;
    		if(ratings[i+1]<ratings[i]) arr[i] = Math.max(arr[i+1]+1, arr[i]);
    	}
    	
    	System.out.println(Arrays.toString(arr));
    	
    	return Arrays.stream(arr).sum();
    }
    
}
