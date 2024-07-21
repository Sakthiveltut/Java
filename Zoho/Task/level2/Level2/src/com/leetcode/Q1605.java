package com.leetcode;

import java.util.Arrays;

public class Q1605 {

	/*Find Valid Matrix Given Row and Column Sums
	
	Example 1:

		Input: rowSum = [3,8], colSum = [4,7]
		Output: [[3,0],
		         [1,7]]
		Explanation: 
		0th row: 3 + 0 = 3 == rowSum[0]
		1st row: 1 + 7 = 8 == rowSum[1]
		0th column: 3 + 1 = 4 == colSum[0]
		1st column: 0 + 7 = 7 == colSum[1]
		The row and column sums match, and all matrix elements are non-negative.
		Another possible matrix is: [[1,2],
		                             [3,5]]
		Example 2:

		Input: rowSum = [5,7,10], colSum = [8,6,8]
		Output: [[0,5,0],
		         [6,1,0],
		         [2,0,8]]*/
		        		 
	public static void main(String[] args) {
		
		Q1605 q = new Q1605();
		//int[] rowSum = {3,8}, colSum = {4,7};
		int[] rowSum = {5,7,10}, colSum = {8,6,8}; 
		
		System.out.println(Arrays.deepToString(q.restoreMatrix(rowSum, colSum)));
	}

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {

    	int numrows = rowSum.length;
        int colrows = colSum.length;
        int[][] result = new int[numrows][colrows];

        int i=0,j=0;

        while(i<numrows && j<colrows){
            int val = Math.min(rowSum[i], colSum[j]);
            result[i][j] = val;
            rowSum[i] -= val;
            colSum[j] -= val;

            if(rowSum[i] == 0){
                i++;
            }
            if(colSum[j] == 0){
                j++;
            }
        }
        return result;
    }
}
