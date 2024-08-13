package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q54SpiralMatrix {

	public static void main(String[] args) {
		/*int[][] array = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };*/
		
		int[][] array = {
			    {1, 2, 3, 4},
			    {5, 6, 7, 8},
			    {9, 10, 11, 12}
			};

		
		System.out.println(spiralOrder(array));
	}
	
    public static List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        if (matrix.length == 0) {
            return res;
        }
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int j = colBegin; j <= colEnd; j ++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            for (int j = rowBegin; j <= rowEnd; j ++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j --) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        
        return res;
    }
    
    
    private List<Integer> list = new LinkedList<>();
    private int xMax;
    private int yMax;

    public List<Integer> spiralOrder1(int[][] matrix) {
        int count = matrix.length * matrix[0].length;
        xMax = matrix.length;
        yMax = matrix[0].length;
  
        recursive(matrix,count,0,0);
        return list;
        
    }

    public void recursive(int[][] matrix,int count,int x,int y){
        if (count <= 0 || x>=xMax || x < 0 || y>=yMax || y < 0 || matrix[x][y] == 420) {
            return;
        }

        // count
        if(matrix[x][y] != 420){
            list.add(matrix[x][y]);
            matrix[x][y] = 420;
            count--;
        }

        // the one and only check for the right condition
        if (x-1<0 || matrix[x-1][y] == 420) 
            recursive(matrix,count,x,y+1); // go right

        recursive(matrix,count,x+1,y); // go down

        recursive(matrix,count,x,y-1); // go left

        recursive(matrix,count,x-1,y); // go up


    }
}
