package com.leetcode.medium;

import java.util.HashSet;

public class Q840MagicSquaresInGrid {

	public static void main(String[] args) {
		System.out.println(numMagicSquaresInside(new int[][] {{7,8,3,1,8},{2,6,10,8,4},{9,4,5,4,3},{10,5,0,5,10},{1,8,7,6,2}}));
		//System.out.println(numMagicSquaresInside(new int[][] {{4}}));
	}
	
    public static int numMagicSquaresInside(int[][] grid) {
    	int result = 0;
	    	for(int i=0;i<grid.length-2;i++) {
	    		for(int j=0;j<grid.length-2;j++) {
	    			int tempResult=grid[i][j]+grid[i][j+1]+grid[i][j+2];
	    			boolean isMagicSquare = true;
	    			
	    			HashSet<Integer> set = new HashSet<>();
	    			
	    			for(int x=i;x<i+3;x++) {
	    				int temp = 0;
	    				for(int y=j;y<j+3;y++) {
	    					
	    					System.out.print(grid[x][y]+" ");
	    					
	    					temp+=grid[x][y];
	    					if(grid[x][y]<=0 || grid[x][y]>=10 || !set.add(grid[x][y])) {
	    						isMagicSquare = false;
	    					}
	    				}
    					System.out.println();
	    				if(temp==tempResult) {
	    					temp=0;
	    				}else { 
	    					isMagicSquare = false;
	    					break;
	    				}
	    			}
	    			
	    			System.out.println();
	    			
	    			if(isMagicSquare) {
		    			for(int x=j;x<j+3;x++) {
		    				int temp=0;
		    				for(int y=i;y<i+3;y++) {
		    					temp+=grid[y][x];
		    				}
		    				if(temp==tempResult) {
		    					temp=0;
		    				}else { 
		    					isMagicSquare = false;
		    					break;
		    				}
		    			}
	    			}
	    			
	    			if(isMagicSquare && tempResult==grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2] &&
	    					tempResult==grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]) {
	    				result++;
	    			}
	    				
	    				
	    			}
	    			
	    		}
    	
    	return result;
    }

}


/*int temp=grid[i][j]+grid[i][j+1]+grid[i][j+2];
if(temp==grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2] && 
	temp==grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2] && 
	
	temp==grid[i][j]+grid[i+1][j]+grid[i+2][j] && 
	temp==grid[i][j+1]+grid[i+1][j+1]+grid[i+2][j+1] &&
	temp==grid[i][j+2]+grid[i+1][j+2]+grid[i+2][j+2] && 

	temp==grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2] &&
	temp==grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]) {*/