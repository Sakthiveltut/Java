package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q274_H_Index {

	public static void main(String[] args) {
		System.out.println(hIndex(new int[] {3,0,6,1,5}));
		System.out.println(hIndex(new int[] {1,3,1}));
	}
	
    public static int hIndex3(int[] citations) {
        int length = citations.length;

        Arrays.sort(citations);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<=citations[length-1];i++){
            int count=0;
            for(int j=0;j<length;j++){
                if(i<=citations[j]){
                    count++;
                }
            }
            map.put(i,count);
        }
        
        System.out.println(map);
        for(int i=citations[length-1];i>=0;i--) {
        	if(i<=map.get(i)) {
        		return i;
        	}
        }

        return 0;
    }
    
    public static int hIndex2(int[] citations) {
	    Arrays.sort(citations);
	    int len = citations.length;
	    for(int i=0;i<len;i++) {
	      if(citations[i]>=len-i) {
	        return len-i;
	      }
	    }
	    return 0;
    }

    
    public static int hIndex(int[] citations) {
    	int length = citations.length;
    	int[] arr = new int[length+1];
    	
    	for(int i=0;i<length;i++) {
    		if(citations[i]<length) {
    			arr[citations[i]]++;
    		}else {
    			arr[length]++;
    		}
    	}
    	int result = 0;
    	for(int i=length;i>=0;i--) {
    		result+=arr[i];
    		if(result>=i) {
    			return i;
    		}
    	}
    	return 0;
    }
}
