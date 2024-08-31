package com.leetcode.easy;

import java.util.Arrays;

public class Q88_Merge_Sorted_Array {

	public static void main(String[] args) {
		merge(new int[] {1,2,3,0,0,0},3, new int[] {2,5,6},3);
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int index = 0;
        for(int i=0;i<m;i++){
            arr[index++] = nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[index++] = nums2[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
