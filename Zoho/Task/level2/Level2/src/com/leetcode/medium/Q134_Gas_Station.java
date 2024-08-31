package com.leetcode.medium;

public class Q134_Gas_Station {

	public static void main(String[] args) {
		//System.out.println(canCompleteCircuit(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2}));
		System.out.println(canCompleteCircuit(new int[] {2,3,4}, new int[] {3,4,3}));
		//System.out.println(canCompleteCircuit(new int[] {2}, new int[] {2}));
	}
	
    public static int canCompleteCircuit1(int[] gas, int[] cost) {
        int remaining = 0;
        int length = gas.length;
    	for(int i=0;i<length;i++) {
    		remaining+=gas[i]-cost[i];
    		if(remaining>=0 && length==1) return 0;
    		if(remaining>0) {
    			int pos=i;
    			while(pos<length) {
    				pos++;
    				pos = pos%length;
    	    		remaining+=gas[pos]-cost[pos];
    	    		if(remaining<0) break;
    	    		if(pos==i) return i;
    			}
    		}else remaining = 0;
    	}
    	return -1;
    }
    
    
    public static int canCompleteCircuit(int[] gas, int[] cost) {
    	int remaining = 0, result = 0, total=0;
    	for(int i=0;i<gas.length;i++) {
    		total+=gas[i]-cost[i];
    		remaining+=gas[i]-cost[i];
    		if(remaining<0) {
    			remaining = 0;
    			result = i+1;
    		}
    	}
    	return total<0?-1:result;
    }
    
}
