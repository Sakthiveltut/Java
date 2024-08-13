package com.leetcode;

public class Q1004MaxConsecutiveOnceIII {

	public static void main(String[] args) {
		int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		System.out.println(longestOnes(arr, 3));
	}
	
    public static int longestOnes(int[] A, int K) {
        int i = 0, j;
        for (j = 0; j < A.length; ++j) {
            if (A[j] == 0) K--;
            if (K < 0 && A[i++] == 0) K++;
        }
        return j - i;
    }

}
