package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1253ReconstructA2RowBinaryMatrix {

	public static void main(String[] args) {
		System.out.println(reconstructMatrix(5,5,new int[] {2,1,2,0,1,0,1,2,0,1}));
		//System.out.println(reconstructMatrix(2,1,new int[] {1,1,1}));
	}
	
	
    public static List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> result = new ArrayList<>();
        int[] rows = {upper, lower};
        for(int i=0;i<rows.length;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<colsum.length;j++){
	            int minValue = Math.min(rows[i], colsum[j]);
	            row.add(minValue);
	            rows[i] -= minValue;
	            colsum[j] -= minValue;
            }
            result.add(row);
        }
        
        System.out.println(result);
        
        return result;
    }
    
    public List<List<Integer>> reconstructMatrix1(int u, int l, int[] cs) {
        boolean[][] res = new boolean[2][cs.length];
        for (int i = 0; i < cs.length; ++i) {
            res[0][i] = cs[i] == 2 || (cs[i] == 1 && l < u);
            res[1][i] = cs[i] == 2 || (cs[i] == 1 && !res[0][i]);
            u -= res[0][i] ? 1 : 0;
            l -= res[1][i] ? 1 : 0;
        }
        return l == 0 && u == 0 ? new ArrayList(Arrays.asList(res[0], res[1])) : new ArrayList();    
    }
    
    public List<List<Integer>> reconstructMatrix2(int upper, int lower, int[] colsum) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>(){{
    		add(new ArrayList<Integer>());
    		add(new ArrayList<Integer>());
    	}};

    	for(int i=0; i < colsum.length; i++){
    		if(colsum[i] == 2){
    			res.get(0).add(1);
    			res.get(1).add(1);
    			upper--;
    			lower--;
    		}else if(colsum[i] == 1){
    			if(upper > lower){
    				res.get(0).add(1);
    				res.get(1).add(0);
    				upper--;
    			}else{
    				res.get(0).add(0);
    				res.get(1).add(1);
    				lower--;
    			}
    		}else{
    			res.get(0).add(0);
    			res.get(1).add(0);
    		}
    	}

    	if(lower != 0 || upper != 0){
    		return Collections.emptyList();
    	}

    	return res;       
    }

}
