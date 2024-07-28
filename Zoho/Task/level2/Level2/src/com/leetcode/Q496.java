package com.leetcode;

import java.util.Arrays;

public class Q496 {

	public static void main(String[] args) {
		//int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};
		int [] nums1 = {3,1,5,7,9,2,6}, nums2 = {1,2,3,5,6,7,9,11};
		System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
	}
	
	/*
	 *  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int position=0;
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
        	for(int j=0;j<nums2.length;j++){
                 if(nums1[i]==nums2[j]){
                	 if(j==nums2.length-1 && position<nums1.length) {
                		 	result[position++] = -1;
                		 	break;
                	 }
                     for(int k=j+1;k<nums2.length && position<nums1.length;k++){
                    	 if(nums1[i]<nums2[k]){
                    		 result[position++] = nums2[k];
                    		 break;
                    	 }else if(k==nums2.length-1) {
                    		 result[position++] = -1;                    	 
                    	 }
                     }
                 }
        	}  
        }
        return result;
    }
	 */
	
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int position=0;
        boolean isMatched = false;
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
        	for(int j=0;j<nums2.length;j++){
                 if(nums1[i]==nums2[j]){
                	 isMatched = true;
                 }
            	 if(isMatched && nums1[i]<nums2[j] && position<nums1.length){
	         		 result[position++] = nums2[j];
	         		 isMatched = false;
	         		 break;
	         	 }else if(isMatched && j==nums2.length-1 && position<nums1.length) {
          		 	result[position++] = -1;
          		 	isMatched = false;
          		 	break;
 	         	 }
        	}  
        }
        return result;
    }

}
