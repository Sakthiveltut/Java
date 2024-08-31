package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
    	int[] arr = {0,9,9};
    	TreeMap<Integer, Integer> map = new TreeMap<>();
    	int[][] result = new int[3][2];
    	for(int i=0;i<arr.length;i++) {
    		int count = map.getOrDefault(arr[i], 0)+1;
    		map.put(arr[i], count);
    		
    		if(result[0][1]<count && result[0][0] == arr[i]) { 
    			result[0][0] = arr[i];
    			result[0][1] = count;    		
    		}
    		else if(result[1][1]<count && result[1][0] == arr[i]) { 
    			result[1][0] = arr[i];
    			result[1][1] = count;    		
    		}
    		else if(result[2][1]<count && result[2][0] == arr[i]) { 
    			result[2][0] = arr[i];
    			result[2][1] = count;    		
    		}
    		else if(result[0][1]<count) { 
    			result[0][0] = arr[i];
    			result[0][1] = count;    		
    		}
    		else if(result[1][1]<count) { 
    			result[1][0] = arr[i];
    			result[1][1] = count;    		
    		}
    		else if(result[2][1]<count) { 
    			result[2][0] = arr[i];
    			result[2][1] = count;    		
    		}
    	}
    	System.out.println(map);
    	if(map.size()<=3)
    		System.out.println(map);
    	else
    		System.out.println(Arrays.deepToString(result));
    }
}




