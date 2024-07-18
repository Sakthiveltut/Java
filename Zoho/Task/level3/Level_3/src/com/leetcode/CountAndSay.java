package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CountAndSay {
	
	public static void main(String[] args) {
		CountAndSay object = new CountAndSay();
		object.countAndSay(7);
	}

	LinkedList<Integer> oldList = new LinkedList<>();
    public String countAndSay(int n) {
    	LinkedList<Integer> currentList = new LinkedList<>();
        oldList.add(1);
        int currentValue, count=0, index=0;
        for(int i=1;i<n;i++) {
        	currentValue = oldList.get(index);
        	for(int j=0;j<oldList.size();j++) {
        		if(currentValue==oldList.get(j)) {
        			count++;
        			if(j==oldList.size()-1) {
            		 	currentList.add(count);
            			currentList.add(currentValue);
            			count=1;
            			currentValue=oldList.get(j);
            		}
        		}if(currentValue!=oldList.get(j)) {
        		 	currentList.add(count);
        			currentList.add(currentValue);
        			count=1;
        			currentValue=oldList.get(j);
        		}
                System.out.println(oldList);
        	}        	
        	oldList = (LinkedList<Integer>) currentList.clone();
        	currentList.clear();
        }
        System.out.println(oldList);
        return "";
    }
}
