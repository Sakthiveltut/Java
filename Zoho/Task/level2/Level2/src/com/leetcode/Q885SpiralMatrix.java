package com.leetcode;

import java.util.Arrays;

public class Q885SpiralMatrix {

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(spiralMatrixIII(1,4,0,0)));
	}
	
    public static int[][] spiralMatrixIII1(int rows, int cols, int rStart, int cStart) {
        
    	int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    	int rowBegin=0, rowEnd=arr.length-1, colBegin=0, colEnd=arr.length-1;
    	while(rowBegin<=rowEnd && colBegin<=colEnd) {
    		for(int i=colBegin;i<=colEnd;i++) {
    			System.out.println(arr[rowBegin][i]);
    		}
    		rowBegin++;
    		
    		for(int i=rowBegin;i<=rowEnd;i++) {
    			System.out.println(arr[i][colEnd]);
    		}
    		colEnd--;
    		
    		
    		if(rowBegin<=rowEnd) {
	    		for(int i=colEnd;i>=colBegin;i--) {
	    			System.out.println(arr[rowEnd][i]);
	    		}
	    		rowEnd--;
    		}
    		
    		if(colBegin<=colEnd) {
	    		for(int i=rowEnd;i>=rowBegin;i--) {
	    			System.out.println(arr[i][colBegin]);
	    		}
	    		colBegin++;
    		}
    		
    	}
    	
    	return null;	
    }
    
    public static int[][] spiralMatrixIII(int R, int C, int x, int y) {
        int[][] res = new int[R * C][2];
        int dx = 0, dy = 1, n = 0, tmp;
        for (int j = 0; j < R * C; ++n) {
            for (int i = 0; i < n / 2 + 1; ++i) {
                if (0 <= x && x < R && 0 <= y && y < C)
                    res[j++] = new int[] {x, y};
                x += dx;
                y += dy;
            }
            tmp = dx;
            dx = dy;
            dy = -tmp;
        }
        return res;
    }
    
        public int[][] spiralMatrixIII4(int rows, int cols, int rStart, int cStart) {
            int[][] spiralMatrix = new int[rows*cols][2];
            int loop = 1; // 1st loop
            int i = 0;
            while(i < rows*cols) {
                // right
                for(int j=0; j<loop; j++) {
                    if(cStart>=0 && cStart<cols && rStart>=0 && rStart<rows && i < rows*cols) {
                        spiralMatrix[i][0]=rStart;
                        spiralMatrix[i][1]=cStart;
                        i++;
                    }
                    cStart++;
                }   
                // down
                for(int j=0; j<loop; j++) {
                    if(cStart>=0 && cStart<cols && rStart>=0 && rStart<rows && i < rows*cols) {
                        spiralMatrix[i][0]=rStart;
                        spiralMatrix[i][1]=cStart;
                        i++;
                    }
                    rStart++;
                }
                loop++;
                // left
                for(int j=0; j<loop; j++) {
                    if(cStart>=0 && cStart<cols && rStart>=0 && rStart<rows && i < rows*cols) {
                        spiralMatrix[i][0]=rStart;
                        spiralMatrix[i][1]=cStart;
                        i++;
                    }
                    cStart--;
                }
                // up
                for(int j=0; j<loop; j++) {
                    if(cStart>=0 && cStart<cols && rStart>=0 && rStart<rows && i < rows*cols) {
                        spiralMatrix[i][0]=rStart;
                        spiralMatrix[i][1]=cStart;
                        i++;
                    }
                    rStart--;
                }
                loop++;
            }
            return spiralMatrix;
        }

}
